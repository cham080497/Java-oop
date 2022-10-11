package lab_09;

import java.util.List;

public class AnimalController {
    public String caculateWinner(List<Animal> animalList){
        int speedWinner = 0;
        String winnerAnimal = "";
        for (Animal animal : animalList) {
            int animalSpeed = animal.getSpeed();
            String animalName = animal.getName();
            System.out.println("Speed of " + animalName + " is: " + animalSpeed);
            if (animal.getSpeed() > speedWinner) {
                speedWinner = animalSpeed;
                winnerAnimal = animalName;
            }
        }
        return winnerAnimal;
    }
}
