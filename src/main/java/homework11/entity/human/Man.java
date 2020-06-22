package homework11.entity.human;

import homework11.entity.pet.Pet;

import java.util.Map;

public  final class Man extends Human implements Greeting {

    public Man(String name, String surname, long birthdate) {
        super(name, surname, birthdate);
    }

    public Man(String name, String surname, long birthdate, int iq, Map<String, String> schedule) {
        super(name, surname, birthdate, iq, schedule);
    }

    public Man() {
    }


    public void greet(Pet p) {

            System.out.printf("Hello, %s , let`s watch football together\n", p.getNickname());


    }

    void repairCar() {
        System.out.println("I am repairing...");
    }
}