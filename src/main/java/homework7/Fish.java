package homework7;

public class Fish extends Pet implements Foul {


    public Fish(String nickname) {
        super(nickname);
        this.species = Species.FISH;

    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.FISH;
    }

    public Fish() {
        this.species = Species.FISH;
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.getNickname());
    }

    public void foul() {

        System.out.println("Come and clean my aquarium.");
    }

}
