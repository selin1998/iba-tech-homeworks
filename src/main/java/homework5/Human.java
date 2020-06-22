package homework5;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Family getFamily() {
        return this.family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }


    public String[][] getSchedule() {
        if (this.schedule != null) {
            String[][] copy = new String[this.schedule.length][this.schedule[0].length];

            System.arraycopy(this.schedule, 0, copy, 0, this.schedule.length);

            return copy;
        } else {
            return null;
        }

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public void setSchedule(String[][] schedule) {
        if (schedule != null) {
            this.schedule = new String[schedule.length][schedule[0].length];

            System.arraycopy(schedule, 0, this.schedule, 0, schedule.length);
        } else {
            this.schedule = null;
        }

    }


    public Human(String name, String surname, int year) {

        setName(name);
        setSurname(surname);
        setYear(year);


    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {

        setName(name);
        setSurname(surname);
        setYear(year);
        setIq(iq);
        setSchedule(schedule);

    }


    public Human() {
    }


    public void welcomeTheFavorite() {
        System.out.printf("Hello, %s\n", family.getPet().getNickname());

    }

    public void describeTheFavorite() {

        System.out.printf("I have a %s, he is %d years old \n", family.getPet().getSpecies(), family.getPet().getAge());
    }

    public boolean feed(boolean timeForFeeding) {
        if (timeForFeeding) {
            System.out.printf("I will feed %s\n", family.getPet().getNickname());
            return true;
        } else {
            int rand = (int) (Math.random() * (100 + 1));
            if (family.getPet().getTrickLevel() > rand) {
                System.out.printf("I will feed %s\n", family.getPet().getNickname());
                return true;
            } else {
                System.out.printf("I think %s is not hungry.\n", family.getPet().getNickname());
                return false;
            }
        }

    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() +
                ", schedule=" + Arrays.deepToString(getSchedule()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                name.equals(human.name) &&
                surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }
}
