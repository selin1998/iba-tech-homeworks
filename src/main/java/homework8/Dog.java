package homework8;

import java.util.Set;

public class Dog extends Pet implements Foul {

    public Dog(String nickname) {
        super(nickname);
        this.species = Species.Dog;
    }

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.Dog;
    }

    public Dog() {
        this.species = Species.Dog;
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.getNickname());
    }

    public void foul() {

        System.out.println("I need to cover it up.");
    }

}
