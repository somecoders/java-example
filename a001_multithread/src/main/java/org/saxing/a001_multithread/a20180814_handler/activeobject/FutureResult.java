package org.saxing.a001_multithread.a20180814_handler.activeobject;

public class FutureResult<T> extends Result<T> {

    private Result<T> result;
    private boolean ready = false;
    public synchronized void setResult(Result<T> result){
        this.result = result;
        this.ready = true;
        notifyAll();
    }

    @Override
    public synchronized T getResultValue() {
        while (!ready){
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        return result.getResultValue();
    }
}