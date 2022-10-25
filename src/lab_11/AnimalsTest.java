package lab_11;

import lab_09.Animal;
import lab_09.AnimalController;
import lab_09.Dog;
import lab_09.Horse;
import lab_09.Tiger;

import java.util.Arrays;
import java.util.List;

public class AnimalsTest {
    public static void main(String[] args) {


        Animal horse = new Horse();
        horse.setName("Horse");
        horse.setRandomSpeed(75);

        Animal tiger = new Tiger();
        tiger.setName("Tiger");
        tiger.setRandomSpeed(100);

        Animal dog = new Dog();
        dog.setName("Dog");
        dog.setRandomSpeed(60);

        List<Animal> animals = Arrays.asList(horse, tiger, dog);

        String winnerAnimal = new AnimalController().caculateWinner(animals);
        System.out.println("Winner is: " + winnerAnimal);

    }
}
