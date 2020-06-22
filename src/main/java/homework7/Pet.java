package homework7;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {

    protected Species species = Species.UNKNOWN;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }


    public Pet(String nickname) {
        //    setSpecies(species);
        setNickname(nickname);


    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        //  setSpecies(species);
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

    public abstract void respond();

    public void foul() {

        System.out.println("I need to cover it up.");
    }


    @Override
    public String toString() {

        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s }", getNickname(), getAge(), getTrickLevel(), Arrays.toString(habits));


    }


}
