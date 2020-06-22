package homework9.controller;

import homework9.entity.family.Family;
import homework9.entity.human.Human;
import homework9.entity.pet.Pet;
import homework9.service.FamilyService;

import java.util.List;

public class FamilyController {
    FamilyService service = new FamilyService();

    public List<Family> getAllFamilies() {
        return service.getAllFamilies();
    }

    public void displayAllFamilies() {
        service.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int count) {

        return service.getFamiliesBiggerThan(count);
    }

    public List<Family> getFamiliesLessThan(int count) {
        return service.getFamiliesLessThan(count);

    }

    public void createNewFamily(Human h1, Human h2) {
        service.createNewFamily(h1, h2);

    }

    public int countFamiliesWithMemberNumber(int count) {
        return (int) service.countFamiliesWithMemberNumber(count);

    }

    public void deleteFamilybyIndex(int index) {
        service.deleteFamilybyIndex(index);
    }

    public Family bornChild(Family family, String masculine, String feminine) {
        return service.bornChild(family, masculine, feminine);
    }

    public Family adoptChild(Family family, Human human) {
        return service.adoptChild(family, human);
    }

    public void deleteAllChildrenOlderThan(int age, int year) {
        service.deleteAllChildrenOlderThan(age, year);
    }

    public int count() {
        return service.count();
    }

    public Family getFamilybyId(int index) {
        return service.getFamilybyId(index);
    }

    public List<Pet> getPets(int index) {
        return service.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        service.addPet(index, pet);
    }


}
