package Ellie.musicapp.Controller.ex;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Cleanup;

public class Detergent extends Cleanup {
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
