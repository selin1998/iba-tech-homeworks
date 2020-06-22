package homework8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {

    protected Species species = Species.UNKNOWN;
    protected String nickname;
    protected int age;
    protected int trickLevel;
    protected Set<String> habits;
    protected Family family;


    public Pet(String nickname) {

        setNickname(nickname);


    }

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {

        setNickname(nickname);
        setAge(age);
        setHabits(habits);
        setTrickLevel(trickLevel);


    }

    public Pet() {


    }


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


    public Set getHabits() {

        Set copy = new HashSet<>();
        copy.addAll(this.habits);
        return copy;

    }


    public void setHabits(Set<String> habits) {

        this.habits = new HashSet<String>();
        this.habits.addAll(habits);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                species == pet.species &&
                nickname.equals(pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age);
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

        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=", getNickname(), getAge(), getTrickLevel()) + String.valueOf(getHabits().toArray());


    }


}
