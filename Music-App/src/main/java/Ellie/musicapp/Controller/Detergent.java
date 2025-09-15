public class Detergent extends Cleanser {
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // gọi lại scrub() của Cleanser
    }

    public void foam() { append(" foam()"); }
}
