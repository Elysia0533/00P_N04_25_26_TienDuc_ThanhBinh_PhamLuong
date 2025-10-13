package ellie.musicapp.callback;

import ellie.musicapp.callback.Caller;
import ellie.musicapp.callback.Callee;

public class TestCallbacks {
    public static void main(String[] args) {
        Caller caller = new Caller();
        Callee callee = new Callee();

        caller.setCallback(callee);
        caller.doWork();
    }
}
