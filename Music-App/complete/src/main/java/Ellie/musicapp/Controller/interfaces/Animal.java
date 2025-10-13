package Ellie.musicapp.Controller.interfaces;

public interface Animal {

    public void animalSound();

}
class Dog implements Animal {

    public void animalSound(){
        System.out.println("Dog is barking");
    }
}