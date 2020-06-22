package homework12.entity.human;

import homework12.entity.pet.Pet;

import java.util.Map;

public  final class Man extends Human implements Greeting {

    public Man(String name, String surname, long birthDate) {
        super(name, surname, birthDate);
    }

    public Man(String name, String surname, long birthDate, int iq) {
        super(name, surname,  birthDate,iq);
    }

    public Man(String name, String surname, long birthDate, int iq, Map<String, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    public Man() {
    }

    @Override
    public String gender() {
        return "boy";
    }

    public void greet(Pet p) {

            System.out.printf("Hello, %s , let`s watch football together\n", p.getNickname());


    }

    void repairCar() {
        System.out.println("I am repairing...");
    }
}