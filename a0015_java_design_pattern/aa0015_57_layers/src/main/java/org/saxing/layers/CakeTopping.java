package org.saxing.layers;

import javax.persistence.*;

/**
 * cake topping
 *
 * @author saxing 2019/3/6 23:30
 */
@Entity
public class CakeTopping {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int calories;

    @OneToOne(cascade = CascadeType.ALL)
    private Cake cake;

    public CakeTopping() {}

    public CakeTopping(String name, int calories) {
        this.setName(name);
        this.setCalories(calories);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("id=%s name=%s calories=%d", id, name, calories);
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

}
