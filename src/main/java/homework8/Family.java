package homework8;

import java.util.*;

public class Family implements HumanCreator {

    private Human mother;
    private Human father;
    private Set<Pet> pet;
    private List<Human> children = new ArrayList<>();
    private String[] MaleNames = {"Johnny", "Joeffrey", "Jimmy", "Jacob", "Jason", "Jonathan"};
    private String[] FemaleNames = {"Jennifer", "Jessica", "Julia", "Juliet", "Jade", "Jane"};

    public Family(Human mother, Human father) {
        setMother(mother);
        setFather(father);
        mother.setFamily(this);
        father.setFamily(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father) &&
                children.equals(family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }


    public Human getMother() {

        return mother;
    }

    public Human getFather() {

        return father;
    }

    public List<Human> getChildren() {
        List<Human> returnList = new ArrayList<>();

        for (Human human : this.children) {
            returnList.add(human);
        }

        return returnList;

    }


    public void setMother(Human mother) {

        this.mother = mother;
    }

    public void setFather(Human father) {

        this.father = father;
    }

    public void setChildren(List<Human> children) {
        this.children = new ArrayList<Human>();
        for (Human human : children) {
            this.children.add(human);
        }

    }

    public Set<Pet> getPet() {
        Set<Pet> copy = new HashSet<>();
        copy.addAll(this.pet);
        return copy;
    }


    public void setPet(Set<Pet> pet) {

        this.pet = new HashSet<>();

        this.pet.addAll(pet);
    }


    public void addChild(Human human) {

        children.add(human);
        human.setFamily(this);

    }

    public boolean deleteChild(int index) {
        if (index > children.size() - 1 || index < 0) {
            return false;
        } else {
            children.get(index).setFamily(null);
            children.remove(index);
            return true;

        }


    }

    public void deleteChild(Human child) {
        if (children.size() > 0 && children.indexOf(child) != -1) {
            children.remove(child);
            child.setFamily(null);
        }
    }

    public int countFamily() {

        int count = 2 + children.size();
        if (getPet() != null) {
            count += pet.size();
        }
        return count;
    }


    @Override
    public Human bornChild() {
        Human h;
        int iq = (this.getFather().getIq() + this.getMother().getIq()) / 2;
        int rand = (int) (Math.random() * 2);

        if (rand == 0) {
            String name = MaleNames[(int) (Math.random() * 6)];
            h = new Man();
            h.setName(name);
            h.setSurname(this.getFather().getSurname());
            h.setYear(2020);
            h.setIq(iq);

        } else {
            String name = FemaleNames[(int) (Math.random() * 6)];
            h = new Woman();
            h.setName(name);
            h.setSurname(this.getFather().getSurname());
            h.setYear(2020);
            h.setIq(iq);

        }
        this.addChild(h);
        return h;
    }


    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.toString() +
                ", father=" + father.toString() +
                ", children=" + getChildren() +
                ", pet=" + String.valueOf(getPet().toArray()) +
                '}';
    }


}

