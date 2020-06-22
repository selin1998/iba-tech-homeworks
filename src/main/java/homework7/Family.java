package homework7;

import java.util.Arrays;
import java.util.Objects;

public class Family implements HumanCreator {

    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet;

    private String[] MaleNames = {"Johnny", "Joeffrey", "Jimmy", "Jacob", "Jason", "Jonathan"};
    private String[] FemaleNames = {"Jennifer", "Jessica", "Julia", "Juliet", "Jade", "Jane"};

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }


    public Family(Human mother, Human father) {
        setMother(mother);
        setFather(father);
        mother.setFamily(this);
        father.setFamily(this);
    }

    public Human getMother() {

        return mother;
    }

    public Human getFather() {

        return father;
    }

    public Human[] getChildren() {
        Human[] copy = new Human[this.children.length];
        System.arraycopy(this.children, 0, copy, 0, copy.length);
        return copy;
    }

    public Pet getPet() {
        return pet;
    }

    public void setMother(Human mother) {

        this.mother = mother;
    }

    public void setFather(Human father) {

        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = new Human[children.length];
        System.arraycopy(children, 0, this.children, 0, children.length);
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        pet.setFamily(this);
    }

    public void addChild(Human human) {

        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = human;
        human.setFamily(this);

    }

    public boolean deleteChild(int index) {
        if (index > children.length - 1 || index < 0) {
            return false;
        } else {
            children[index].setFamily(null);
            Human[] newChildren = new Human[children.length - 1];
            int j = 0;
            for (int i = 0; i < children.length; i++) {
                if (i != index) {
                    newChildren[j] = children[i];
                    j++;
                }
            }

            children = newChildren.clone();


            return true;

        }


    }

    public void deleteChild(Human child) {
        if (children.length > 0 && Arrays.asList(children).indexOf(child) != -1) {
            Human[] result = new Human[children.length - 1];
            int j = 0;
            for (Human aChildren : children) {
                if (aChildren.hashCode() == child.hashCode()) {
                    if (aChildren.equals(child)) {
                        continue;
                    }
                }
                result[j++] = aChildren;
            }
            children = result;
        }
    }

    public int countFamily() {

        int count = 2 + children.length;
        if (getPet() != null) {
            count++;
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
            h.setSurname(this.getFather().getSurname() + "a");
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
                ", children=" + Arrays.toString(children) +
                ", pet=" + String.valueOf(pet) +
                '}';
    }

}
