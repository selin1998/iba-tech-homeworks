package homework12.entity.pet;

import homework12.entity.family.Family;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pet extends homework10.entity.pet.Pet {

    protected Species species= Species.UNKNOWN;
    protected String nickname;
    protected  int age;
    protected   int trickLevel;
    protected Set<String> habits;
    protected Family family;

    public Species getSpecies1() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Family getFamily1() {
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
        if(this.habits!=null){
            Set copy= new HashSet<>();
            copy.addAll(this.habits);
            return copy;
        }

        else{
            return null;
        }


    }


    public void setHabits(Set<String> habits) {

        this.habits= new HashSet<String>();
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


    public Pet( String nickname){

        setNickname(nickname);


    }

    public Pet(String nickname, int age, int trickLevel, Set<String> habits){

        setNickname(nickname);
        setAge(age);
        setHabits(habits);
        setTrickLevel(trickLevel);


    }

    public Pet(){


    }



    public void eat (){
        System.out.println("I am eating");

    }

    public abstract void respond ();

    public void foul (){

        System.out.println("I need to cover it up.");
    }


    public String prettyFormat(){

        return "{" +
                "species:" + species +
                ", nickname:'" + nickname + '\'' +
                ", age:" + age +
                ", trickLevel:" + trickLevel +
                ", habits:" + habits +
                '}';
    }




    @Override
    public String toString() {
        return "{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
}
