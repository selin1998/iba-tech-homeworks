package homework9.entity.human;

import homework9.entity.pet.Pet;

import java.util.Map;

public final class Man extends Human implements Greeting {

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq, Map<String, String> schedule) {
        super(name, surname, year, iq, schedule);
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