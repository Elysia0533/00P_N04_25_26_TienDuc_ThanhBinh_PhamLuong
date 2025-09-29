package Ellie.musicapp.controller;

public class TestOuterInner {

    private String message = "Xin chào từ Outer class!";

    // Inner class
    public class Inner {
        public void showMessage() {
            System.out.println("Inner thấy message: " + message);
        }
    }

    public static void main(String[] args) {
        // Tạo outer
        TestOuterInner outer = new TestOuterInner();

        // Tạo inner
        TestOuterInner.Inner inner = outer.new Inner();

        // Gọi method
        inner.showMessage();
    }
}

