package homework7;

import java.util.Arrays;

public final class Woman extends Human implements Greeting {

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Woman() {
    }

    @Override
    public void greet() {
        System.out.printf("Hello, %s , let me stroke you!\n", this.getFamily().getPet().getNickname());
    }

    public void bakery() {

        System.out.println(this.getFamily().getFather().getName() + ", buy bread when you come home!");
    }

}
