package homework7;

public class RoboCat extends Pet implements Foul {


    public RoboCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.ROBOCAT;
    }

    public RoboCat(String nickname) {
        super(nickname);
        this.species = Species.ROBOCAT;
    }

    public RoboCat() {
        this.species = Species.ROBOCAT;
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.getNickname());
    }

    public void foul() {

        System.out.println("I dont need to be covered up.");
    }

}
