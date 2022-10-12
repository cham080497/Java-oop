package lab_10;

import java.util.Arrays;
import java.util.List;

import static lab_10.Animals.Builder;

public class AnimalsRacingTest {
    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.setAnimalName("Tiger").setFly(false).setAnimalSpeed(70);

        Animals horse = builder.build();

        builder = new Builder();
        builder.setAnimalName("Snake").setFly(false).setAnimalSpeed(80);

        Animals tiger = builder.build();

        builder = new Builder();
        builder.setAnimalName("Cheetah").setFly(false).setAnimalSpeed(100);

        Animals dog = builder.build();

        builder = new Builder();
        builder.setAnimalName("Elephant").setFly(true).setAnimalSpeed(90);

        Animals eagle = builder.build();

        builder = new Builder();
        builder.setAnimalName("Eagle").setFly(false).setAnimalSpeed(200);

        Animals squirrel = builder.build();

        AnimalsController animalController = new AnimalsController();
        List<Animals> animalList = Arrays.asList(horse, tiger, dog, eagle, squirrel);
        List<Animals> racerAnimalList = animalController.getRacerAnimals(animalList);
        String winner = animalController.getTheWinner(racerAnimalList);
        System.out.println("Winner is: " + winner);

    }
}
