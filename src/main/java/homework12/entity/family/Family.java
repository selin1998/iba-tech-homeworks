package homework12.entity.family;


import homework12.entity.human.Human;
import homework12.entity.human.Man;
import homework12.entity.human.Woman;
import homework12.entity.pet.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Family {

    protected Human mother;
    protected Human father;
     List<Pet> pet=new ArrayList<>();
    List<Human> children= new ArrayList<>();
    private static int id=1;
    private int ident;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) &&
                father.equals(family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }

    public Family(Human mother, Human father) {
        ident=id++;
        setMother(mother);
        setFather(father);

    }

    public int getIdentifier(){
        return ident;
    }

    public Human getMother() {

        return mother;
    }

    public Human getFather() {

        return father;
    }

    public List<Human> getChildren() {
       List<Human> returnList= new ArrayList<>();

       for(Human human:this.children){
           returnList.add(human);
       }

       return returnList;

    }



    public void setMother(Human mother) {

        this.mother = mother ;
    }

    public void setFather(Human father) {

        this.father = father;
    }

    public void setChildren(List<Human> children) {
        this.children = new ArrayList<Human>();
        for(Human human: children){
            this.children.add(human);
        }

    }

    public List<Pet> getPet() {

        return pet;
    }


    public void setPet(List<Pet> pets) {

        this.pet= new ArrayList<>(pets);

    }
    public void addPet(Pet p){
        this.pet.add(p);
    }


    public  void addChild(Human human){

        children.add(human);

    }

    public boolean deleteChild(int index){
        if (index>children.size()-1 || index<0){
            return false;
        }
        else {
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

    public int countFamily(){

        int count=2 +getChildren().size();
        if(getPet()!=null) {
            count+=getPet().size();
        }
        return count ;
    }


    public Human bornChild(String male, String female) {

            Human h;
            int iq= (this.getFather().getIq()+ this.getMother().getIq())/2;
            int rand= (int)(Math.random()*2);

            if(rand==0){
                h=new Man();
                h.setName(male);
                h.setSurname(this.getFather().getSurname());
                h.setBirthDate(1585125132000L);
                h.setIq(iq);

            }
            else{
                h=new Woman();
                h.setName(female);
                h.setSurname(this.getFather().getSurname());
                h.setBirthDate(1585125132000L);
                h.setIq(iq);

            }
            this.addChild(h);
            return h;
        }


    public String prettyFormat(){
        StringBuilder family=new StringBuilder();
        family.append("Family-");
        family.append(getIdentifier()+"\n");
        family.append("mother: " + mother.prettyFormat());
        family.append(",\nfather: " + father.prettyFormat());
        family.append(",\nchildren:");
        for (Human child : getChildren()) {
            family.append("\n    "+child.gender()+": "+child.prettyFormat());
        }

        family.append("\npets: " + Arrays.toString(getPet().toArray()));
        family.append("\n");
        return family.toString();

    }


    public String toString() {

        return prettyFormat();

    }


}
