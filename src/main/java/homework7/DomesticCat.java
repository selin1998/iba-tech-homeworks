package homework7;

public class DomesticCat extends Pet implements Foul {

    public DomesticCat(String nickname) {
        super(nickname);
        this.species = Species.DOMESTICCAT;
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOMESTICCAT;
    }

    public DomesticCat() {
        this.species = Species.DOMESTICCAT;
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.getNickname());
    }

    public void foul() {

        System.out.println("I regularly clean myself.");
    }


}
