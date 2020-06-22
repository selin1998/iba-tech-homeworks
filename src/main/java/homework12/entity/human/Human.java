package homework12.entity.human;

import homework12.entity.family.Family;
import homework12.entity.pet.Pet;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public  class Human implements Gender {

    private String name;
    private String surname;
    private int iq;
    private Map<String, String> schedule;
    private Family family;
    private long birthDate;

    public Human() {
    }


    public Human(String name, String surname, long birthDate) {

        setName(name);
        setSurname(surname);
        setBirthDate(birthDate);


    }


    public Human(String name, String surname, long birthDate, int iq) {

        setName(name);
        setSurname(surname);
        setBirthDate(birthDate);
        setIq(iq);


    }

    public Human(String name, String surname, long birthDate, int iq, Map<String, String> schedule) {

        this(name, surname, birthDate);
        setIq(iq);
        setSchedule(schedule);

    }

    public Human(String name, String surname, String adoptedChildBD, int iq) {
        setName(name);
        setSurname(surname);
        setIq(iq);
        setBirthDate(LocalDate.parse(adoptedChildBD, DateTimeFormatter.ofPattern("dd/MM/yyyy")).atStartOfDay(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli());


    }





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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public LocalDate getAge(){
        LocalDate age= Instant.ofEpochMilli(birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
        return age;
    }


    public String describeAge() {
        StringBuilder ageDesc = new StringBuilder();

        return ageDesc.append("Years: " + Period.between(getAge(), LocalDate.now()).getYears())
                .append(", month: " + Period.between(getAge(), LocalDate.now()).getMonths())
                .append(", days: " + Period.between(getAge(), LocalDate.now()).getDays())
                .toString();
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

    public String prettyFormat(){

        return "{" +
                "name:'" + getName() + '\'' +
                ", surname:'" + getSurname() + '\'' +
                ", birthDate:" + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(getAge()) +
                ", iq:"+getIq()+
                ", schedule:" + getSchedule() +
                '}';

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate &&
                name.equals(human.name) &&
                surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", birthDate=" + DateTimeFormatter.ofPattern("E, MMM dd yyyy").format(getAge()) +
                ", schedule=" + getSchedule() +
                '}';
    }


    @Override
    public String gender() {
        return "child";
    }
}
