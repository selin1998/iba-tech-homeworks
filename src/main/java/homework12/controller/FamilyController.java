package homework12.controller;

import homework12.entity.family.Family;
import homework12.entity.human.Human;
import homework12.entity.pet.Pet;
import homework12.exception.FamilyOverflowException;
import homework12.service.FamilyService;

import java.util.List;


public class FamilyController {
    FamilyService service= new FamilyService();
    public List<Family> getAllFamilies(){
       return service.getAllFamilies();
    }

    public void displayAllFamilies(){
        service.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count){

      return  service.getFamiliesBiggerThan(count);
    }
    public List<Family> getFamiliesLessThan(int count){
      return  service.getFamiliesLessThan(count);

    }
    public void createNewFamily(Human h1, Human h2){
        service.createNewFamily(h1,h2);

    }
    public int countFamiliesWithMemberNumber(int count){
       return (int)service.countFamiliesWithMemberNumber(count);

    }


    public Family bornChild(Family family, String masculine, String feminine){
        Family updatedFamily = family;
        try{

            updatedFamily= service.bornChild(family,masculine,feminine);
        }
        catch (NullPointerException e){
            System.out.println("No family with this identifier");
        }
        catch(FamilyOverflowException ex){

        }

        return updatedFamily;
    }



    public Family adoptChild(Family family, Human human){

        Family updatedFamily = family;
        try{

            updatedFamily= service.adoptChild(family,human);
        }
        catch (NullPointerException e){
            System.out.println("No family with this identifier");
        }
        catch(FamilyOverflowException ex){

        }

        return updatedFamily;

    }



    public void deleteAllChildrenOlderThan(int age){
        service.deleteAllChildrenOlderThan(age);
    }
    public int count(){
       return service.count();
    }

    public Family getFamilybyIdentifier(int id){
        return service.getAllFamilies().stream().filter(x -> x.getIdentifier() == id).findFirst().get();
    }

    public int getIndexbyFamily(Family fam){
      return  service.getAllFamilies().indexOf(fam);

    }

    public void deleteFamilybyIndex(int identifier){

        service.deleteFamilybyIndex(getIndexbyFamily(getFamilybyIdentifier(identifier)));
    }

    public Family getFamilybyId(int index){

            return service.getFamilybyId(index);

    }
    public List<Pet> getPets(int index){
            return service.getPets(index);
    }
    public void addPet(int index, Pet pet){
        service.addPet(index,pet);
    }


}
