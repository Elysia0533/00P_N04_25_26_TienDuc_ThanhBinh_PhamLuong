public class CompositionDemo {
    private Detergent d = new Detergent(); // composition

    public void scrub() {
        d.scrub(); // dùng Detergent để scrub
    }

    public void foam() {
        d.foam(); // dùng Detergent để foam
    }

    @Override
    public String toString() {
        return d.toString();
    }

    public static void main(String[] args) {
        CompositionDemo cd = new CompositionDemo();
        cd.scrub();
        cd.foam();
        System.out.println(cd);
    }
}
