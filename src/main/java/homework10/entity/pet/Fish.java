package homework10.entity.pet;

import java.util.Set;

public class Fish extends Pet implements Foul {


    public Fish(String nickname) {
        super(nickname);
        this.species= Species.Fish;

    }

    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species= Species.Fish;
    }

    public Fish() {
        this.species= Species.Fish;
    }

    public void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.getNickname());
    }
    public void foul (){

        System.out.println("Come and clean my aquarium.");
    }

}
