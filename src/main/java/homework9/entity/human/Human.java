package homework9.entity.human;

import homework9.entity.family.Family;
import homework9.entity.pet.Pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {


    protected String name;
    protected String surname;
    protected int year;
    protected int iq;
    protected Map<String, String> schedule;
    protected Family family;

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


    public Map<String, String> getSchedule() {
        if (this.schedule != null) {
            Map<String, String> copy = new HashMap<String, String>();
            copy.putAll(this.schedule);

            return copy;
        } else {
            return null;
        }

    }


    public void setSchedule(Map<String, String> schedule) {
        if (schedule != null) {
            this.schedule = new HashMap<>();
            this.schedule.putAll(schedule);

        } else {
            this.schedule = null;
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


    public Human(String name, String surname, int year) {

        setName(name);
        setSurname(surname);
        setYear(year);


    }

    public Human(String name, String surname, int year, int iq, Map<String, String> schedule) {

        setName(name);
        setSurname(surname);
        setYear(year);
        setIq(iq);
        setSchedule(schedule);

    }


    public Human() {
    }


    public void describeTheFavorite() {

        if (family.getPet() != null) {
            for (Pet p : family.getPet()) {
                System.out.printf("I have a %s, he is %d years old \n", p.getSpecies().name(), p.getAge());
            }
        }

    }

    public boolean feed(boolean timeForFeeding) {
        if (timeForFeeding) {
            for (Pet p : family.getPet()) {
                System.out.printf("I will feed %s\n", p.getNickname());
            }
            return true;
        } else {
            int rand = (int) (Math.random() * (100 + 1));
            for (Pet p : family.getPet()) {
                if (p.getTrickLevel() > rand) {
                    System.out.printf("I will feed %s\n", p.getNickname());
                    return true;
                } else {
                    System.out.printf("I think %s is not hungry.\n", p.getNickname());
                    return false;
                }
            }
            return true;

        }

    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() +
                ", schedule=" + getSchedule() +
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
