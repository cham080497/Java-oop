package lab_11;

import lab_11.Animals;

import java.util.List;

public class AnimalController {
    public String caculateWinner(List<Animals> animalList){
        int speedWinner = 0;
        String winnerAnimal = "";
        for (Animals animal : animalList) {
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
