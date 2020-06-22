package homework12.entity.pet;

import java.util.Set;

public class DomesticCat extends Pet implements Foul {

    public DomesticCat(String nickname) {
        super(nickname);
        this.species= Species.DomesticCat;
    }

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species= Species.DomesticCat;
    }

    public DomesticCat() {
        this.species= Species.DomesticCat;
    }

    public void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.getNickname());
    }

    public void foul (){

        System.out.println("I regularly clean myself.");
    }


}
