package org.saxing.multithread.a20180814_handler.activeobject;

public class RealResult<T> extends Result<T> {

    private final T resultvalue;

    public RealResult(T resultvalue) {
        this.resultvalue = resultvalue;
    }

    @Override
    public T getResultValue() {
        return resultvalue;
    }
}
