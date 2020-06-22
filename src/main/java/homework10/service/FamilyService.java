package homework10.service;

import homework10.dao.CollectionFamilyDAO;
import homework10.dao.FamilyDAO;
import homework10.entity.family.Family;
import homework10.entity.human.Human;
import homework10.entity.pet.Pet;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {

    FamilyDAO dao=new CollectionFamilyDAO() ;

    public List<Family> getAllFamilies(){
        return dao.getAllFamilies();
    }

    public void displayAllFamilies(){
        dao.getAllFamilies().stream().forEach(x-> System.out.println(x));
    }

    public List<Family> getFamiliesBiggerThan(int count){

        return dao.getAllFamilies().stream().filter(x->x.countFamily()>count).collect(Collectors.toList());

    }
    public List<Family> getFamiliesLessThan(int count){

        return dao.getAllFamilies().stream().filter(x->x.countFamily()<count).collect(Collectors.toList());

    }
    public void createNewFamily(Human h1, Human h2){
        dao.saveFamily(new Family(h1,h2));

    }
    public long countFamiliesWithMemberNumber(int count){
        return dao.getAllFamilies().stream().filter(x->x.countFamily()==count).count();

    }

    public void deleteFamilybyIndex(int index){
        dao.deleteFamily(index);
    }

    public Family bornChild(Family family, String masculine, String feminine){
        family.bornChild(masculine,feminine);
        dao.saveFamily(family);
        return family;

    }

    public Family adoptChild(Family family,Human human){
        family.addChild(human);
        dao.saveFamily(family);
        return family;

    }


    public void deleteAllChildrenOlderThan(int age){

        getAllFamilies()
                .stream()
                .forEach(x->x.getChildren().removeIf((child) -> ChronoUnit.YEARS.between(child.getAge(), LocalDate.now())>age));
                  //  family.setChildren(newChildrenList);
                  //  dao.saveFamily(family);
        }



    public int count(){
        return dao.getAllFamilies().size();

    }
    public Family getFamilybyId(int index){
        return dao.getFamilybyIndex(index);

    }
    public List<Pet> getPets(int index){
        List<Pet> petList = new ArrayList<>(dao.getFamilybyIndex(index).getPet());
        return petList ;

    }
    public void addPet(int index, Pet pet){
        dao.getFamilybyIndex(index).getPet().add(pet);
      dao.saveFamily(dao.getFamilybyIndex(index));

    }


}
