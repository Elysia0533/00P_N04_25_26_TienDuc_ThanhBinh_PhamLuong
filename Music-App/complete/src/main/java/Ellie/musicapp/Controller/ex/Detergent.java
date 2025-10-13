<public class Detergent extends Cleanser {
    public void scrub() {
        System.out.println("Detergent: scrub()");
    }

    public void foam() {
        System.out.println("Detergent: foam()");
    }

    @Override
    public String toString() {
        return "Detergent ready!";
    }
}
