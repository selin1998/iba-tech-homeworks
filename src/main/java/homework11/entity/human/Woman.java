package homework11.entity.human;

import homework11.entity.pet.Pet;

import java.util.Map;

public final class Woman extends Human implements Greeting {

    public Woman(String name, String surname, long birthdate) {
        super(name, surname, birthdate);
    }

    public Woman(String name, String surname, long birthdate, int iq, Map<String, String> schedule) {
        super(name, surname, birthdate, iq, schedule);
    }

    public Woman() {
    }

    @Override
    public void greet(Pet p) {

            System.out.printf("Hello, %s , let me stroke you!\n", p.getNickname());


    }

    public void bakery(){

        System.out.println(this.getFamily().getFather().getName() +", buy bread when you come home!");
    }

}
