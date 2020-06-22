package homework12.entity.human;

import homework12.entity.pet.Pet;

import java.util.Map;

public final class Woman extends Human implements Greeting {

    public Woman(String name, String surname, long birthDate) {
        super(name, surname,  birthDate);
    }

    public Woman(String name, String surname, long birthDate, int iq) {
        super(name, surname,  birthDate,iq);
    }
    public Woman(String name, String surname, long birthDate, int iq, Map<String, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    public Woman() {
    }

    @Override
    public String gender(){
        return "girl";
    }

    @Override
    public void greet(Pet p) {

            System.out.printf("Hello, %s , let me stroke you!\n", p.getNickname());


    }

    public void bakery(){

        System.out.println(this.getFamily().getFather().getName() +", buy bread when you come home!");
    }

}
