package lab_12;

public class Eagle implements MoveAble, FlyAble{
    @Override
    public boolean flyAble() {
        return true;
    }

    @Override
    public int speed() {
        return 60;
    }

    @Override
    public String toString() {
        return flyAble() + " + " + speed();
    }
}
