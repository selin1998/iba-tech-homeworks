package homework11.entity.pet;

import java.util.Set;

public class RoboCat extends Pet implements Foul {


    public RoboCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super( nickname, age, trickLevel, habits);
        this.species= Species.RoboCat;
    }

    public RoboCat(String nickname) {
        super(nickname);
        this.species= Species.RoboCat;
    }

    public RoboCat() {
        this.species= Species.RoboCat;
    }

    public void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.getNickname());
    }

    public void foul (){

        System.out.println("I dont need to be covered up.");
    }

}
