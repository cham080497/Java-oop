package lab_09;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;

    public int getSpeed(){
        return speed;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRandomSpeed(int speed){
        this.speed = new SecureRandom().nextInt(speed);
    }
}
