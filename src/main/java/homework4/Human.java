package homework4;

public class Human {

    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    public String[][] schedule;


    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;

    }

    public Human(String name, String surname, int year, Human mother, Human father, int iq, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;

    }


    public Human() {
    }

    public String slyness(int trickLevel) {
        if (this.pet.trickLevel > 50) {
            return "he/she is almost not sly <50";
        } else {
            return "he/she is very sly >50";
        }
    }


    public void greetPet() {
        System.out.printf("Hello, %s\n", pet.nickname);

    }

    public void describePet() {

        System.out.printf("I have a %s, he is %d years old, %s \n", pet.species, pet.age, slyness(pet.trickLevel));
    }

    public boolean feedPet(boolean timeForFeeding) {
        if (timeForFeeding) {
            System.out.printf("I will feed %s\n", pet.nickname);
            return true;
        } else {
            int rand = (int) (Math.random() * (100 + 1));
            if (pet.trickLevel > rand) {
                System.out.printf("I will feed %s\n", pet.nickname);
                return true;
            } else {
                System.out.printf("I think %s is not hungry.\n", pet.nickname);
                return false;
            }
        }

    }


    @Override
    public String toString() {
        return String.format("Human{name=%s, surname=%s, year=%d, iq=%d, mother=%s %s, father=%s %s, pet=%s}", name, surname, year, iq, mother.name, mother.surname, father.name, father.surname, pet.toString());
    }
}
