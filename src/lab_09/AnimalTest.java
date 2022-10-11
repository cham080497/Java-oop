package lab_09;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
//        Employee emp1 = new FTE();
//        emp1.setName("Minh Duc");
//        emp1.setSalary(50000);
//        Employee emp2 = new Contractor();
//        emp2.setName("Lisa");
//        emp2.setSalary(40000);
//        Employee emp3 = new FTE();
//        emp3.setName("Duong Giang");

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
