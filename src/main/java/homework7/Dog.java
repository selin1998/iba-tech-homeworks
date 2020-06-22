package homework7;

public class Dog extends Pet implements Foul {

    public Dog(String nickname) {
        super(nickname);
        this.species = Species.DOG;
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOG;
    }

    public Dog() {
        this.species = Species.DOG;
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.getNickname());
    }

    public void foul() {

        System.out.println("I need to cover it up.");
    }

}
