package homework7;

public class Man extends Human implements Greeting {

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Man() {
    }


    public void greet() {
        System.out.printf("Hello, %s , let`s watch football together\n", this.getFamily().getPet().getNickname());
    }

    void repairCar() {
        System.out.println("I am repairing...");
    }
}