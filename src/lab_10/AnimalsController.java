package lab_10;

import java.util.ArrayList;
import java.util.List;

public class AnimalsController {
    public String getTheWinner(List<Animals> animalList) {
        String winner = "";
        int winnerSpeed = 0;
        for(Animals animal : animalList){
            int animalSpeed = animal.getAnimalSpeed();
            String animalName = animal.getAnimalName();
            System.out.println("Speed of " + animalName + " is: " + animalSpeed);
            if(animal.getAnimalSpeed() > winnerSpeed){
                winnerSpeed = animalSpeed;
                winner = animalName;
            }
        }

        return winner;
    }
    public List<Animals> getRacerAnimals(List<Animals> animalList) {
        List<Animals> racerAnimalList = new ArrayList<>();

        for(Animals animal : animalList){
            if(!animal.getFlyAble()){
                racerAnimalList.add(animal);
            }
        }

        return racerAnimalList;
    }
}
