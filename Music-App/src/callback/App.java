package src.callback;
public class App {
    public static void main(String[] args) {
        Caller caller = new Caller(new Callback() {
            @Override
            public void onCall(int count) {
                System.out.println("Callback nhận được từ lần gọi thứ " + count);
            }
        });

        for (int i = 1; i <= 10; i++) {
            caller.go(i);
        }
    }

}
