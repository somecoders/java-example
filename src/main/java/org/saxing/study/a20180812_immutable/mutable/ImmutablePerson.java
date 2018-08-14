package org.saxing.study.a20180812_immutable.mutable;

public final class ImmutablePerson {

    private final String name;
    private final String address;

    public ImmutablePerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ImmutablePerson(MutablePerson person){
        // 此处应该 synchronized
        this.name = person.getName();
        this.address = person.getAddress();
    }

    public MutablePerson getMutablePerson(){
        return new MutablePerson(this);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

