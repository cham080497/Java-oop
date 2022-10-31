package lab_12;

public class Dog implements MoveAble, FlyAble{

    @Override
    public boolean flyAble() {
        return false;
    }

    @Override
    public int speed() {
        return 50;
    }

    @Override
    public String toString() {
        return flyAble() + " + " + speed();
    }
}
