package src.callback;

public class Caller {
    private Incrementable callbackReference;

    public Caller(Incrementable cbr) {
        this.callbackReference = cbr;
    }

    public void go() {
        callbackReference.increment();
    }
}

