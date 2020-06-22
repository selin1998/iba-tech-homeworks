package homework6;


import java.util.Arrays;
import java.util.Objects;

public class Pet {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Family family;

    public Family getFamily() {
        return family;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println(species + " " + nickname + ". This pet is removed.");
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Species getSpecies() {
        return this.species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        String[] copy = new String[this.habits.length];
        System.arraycopy(this.habits, 0, copy, 0, habits.length);
        return copy;
    }

    public void setHabits(String[] habits) {
        this.habits = new String[habits.length];
        System.arraycopy(habits, 0, this.habits, 0, habits.length);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname) &&
                Objects.equals(age, pet.age);

    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname);
    }


    public Pet(Species species, String nickname) {
        setSpecies(species);
        setNickname(nickname);


    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        setSpecies(species);
        setNickname(nickname);
        setAge(age);
        setHabits(habits);
        setTrickLevel(trickLevel);


    }

    public Pet() {


    }


    public void eat() {
        System.out.println("I am eating");

    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", nickname);

    }

    public void foul() {

        System.out.println("I need to cover it up.");
    }


    @Override
    public String toString() {

        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s }", getSpecies(), getNickname(), getAge(), getTrickLevel(), Arrays.toString(habits));


    }


}
