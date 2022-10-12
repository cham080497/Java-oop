package lab_10;
import java.security.SecureRandom;

public class Animals {
    private int animalSpeed;
    private Boolean isFlyAble;
    private String animalName;

    protected Animals(Builder builder) {
        this.animalSpeed = builder.animalSpeed;
        this.isFlyAble = builder.isFlyAble;
        this.animalName = builder.animalName;
    }
    public int getAnimalSpeed() {
        return this.animalSpeed;
    }

    public Boolean getFlyAble() {
        return this.isFlyAble;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public static class Builder {
        private int animalSpeed;
        private Boolean isFlyAble;
        private String animalName;

        public Animals build() {
            return new Animals(this);
        }
        public Builder setAnimalSpeed(int randomSpeed) {
            this.animalSpeed = new SecureRandom().nextInt(randomSpeed);
            return this;
        }

        public Builder setFly(boolean isFlyAble) {
            this.isFlyAble = isFlyAble;
            return this;
        }

        public Builder setAnimalName(String animalName) {
            this.animalName = animalName;
            return this;
        }
    }

}
