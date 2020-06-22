package homework13.service;

import homework13.entity.family.Family;
import homework13.entity.human.Human;
import homework13.entity.human.Woman;
import homework13.entity.pet.Dog;
import homework13.entity.pet.DomesticCat;
import homework13.entity.pet.Pet;
import homework13.entity.pet.RoboCat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {

    Human curie1 = new Human("Pierre", "Curie", 1859);
    Human curie2 = new Human("Maria", "Sklodowska", 1867);
    Human curie3 = new Human("Irene-Joliot", "Curie", 1897);
    Human curie4 = new Human("Eve", "Curie", 1904);


    Human mother2 = new Human("Mia", "Smith", 1880);
    Human father2 = new Human("Mark", "Smith", 1881);
    Human child2 = new Human("Joseph", "Smith", 1899);


    Human simpson1 = new Human("Homer", "Simpson", 1951);
    Human simpson2 = new Human("Marge", "Simpson", 1953);


    Family f = new Family(curie2, curie1);
    FamilyService fs = new FamilyService();
    List<Family> familyList = new ArrayList<>();


    @BeforeEach
    void setUp() {
        fs.createNewFamily(curie2, curie1);
        fs.createNewFamily(mother2, father2);
        familyList.add(fs.getFamilybyId(0));
        familyList.add(fs.getFamilybyId(1));

    }

    @Test
    void getAllFamilies() {

        Family f1 = new Family(curie2, curie1);
        Family f2 = new Family(mother2, father2);
        assertEquals(2, fs.getAllFamilies().size());
        assertEquals(f1, fs.getAllFamilies().get(0));
        assertEquals(f2, fs.getAllFamilies().get(1));

    }

    @Test
    void getFamiliesBiggerThan() {
        assertEquals(familyList, fs.getFamiliesBiggerThan(1));
        fs.addPet(1, new Dog());
        fs.addPet(1, new DomesticCat());
        fs.addPet(1, new RoboCat());
        assertEquals(1, fs.getFamiliesBiggerThan(4).size());


    }

    @Test
    void getFamiliesLessThan() {
        assertEquals(familyList, fs.getFamiliesLessThan(3));
        fs.addPet(1, new Dog());
        fs.addPet(1, new DomesticCat());
        assertEquals(1, fs.getFamiliesLessThan(4).size());


    }

    @Test
    void createNewFamily() {
        assertEquals(2, fs.count());
        fs.createNewFamily(simpson2, simpson1);
        assertEquals(3, fs.count());

        familyList.add(new Family(simpson2, simpson1));
        assertEquals(familyList, fs.getAllFamilies());

    }

    @Test
    void countFamiliesWithMemberNumber() {
        assertEquals(2, fs.countFamiliesWithMemberNumber(2));
        fs.bornChild(familyList.get(1), "Leo", "Leona");
        fs.bornChild(familyList.get(1), "Teo", "Tina");
        assertEquals(1, fs.countFamiliesWithMemberNumber(4));
    }

    @Test
    void deleteFamilybyIndex() {
        fs.deleteFamilybyIndex(0);
        familyList.remove(0);
        assertEquals(familyList, fs.getAllFamilies());
    }

    @Test
    void bornChild() {
        fs.bornChild(f, "Joshua", "Marinette");
        assertEquals(1, f.getChildren().size());
        assertEquals("Curie", f.getChildren().get(0).getSurname());
        if (f.getChildren().get(0) instanceof Woman) {
            assertEquals("Marinette", f.getChildren().get(0).getName());
        } else {
            assertEquals("Joshua", f.getChildren().get(0).getName());
        }
    }

    @Test
    void adoptChild() {
        fs.adoptChild(f, curie3);
        fs.adoptChild(f, curie4);
        assertEquals(4, f.countFamily());

    }

    @Test
    void deleteAllChildrenOlderThan() {
        fs.adoptChild(familyList.get(0), curie3);
        fs.adoptChild(familyList.get(0), curie4);
        fs.adoptChild(familyList.get(1), child2);
        fs.deleteAllChildrenOlderThan(18);
        assertFalse(familyList.get(0).getChildren().contains(curie3));
        assertFalse(familyList.get(0).getChildren().contains(curie4));
        assertEquals(0, familyList.get(1).getChildren().size());

    }

    @Test
    void count() {
        assertEquals(2, fs.count());
        fs.createNewFamily(simpson2, simpson1);
        assertEquals(3, fs.count());
    }

    @Test
    void getFamilybyId() {
        assertEquals(familyList.get(0), fs.getFamilybyId(0));
        assertEquals(familyList.get(1), fs.getFamilybyId(1));

    }


    @Test
    void addAndGetPet() {
        fs.createNewFamily(curie2, curie1);
        Pet Wallee = new RoboCat("WALLEE");
        Pet rex = new Dog("Rex");
        fs.addPet(0, Wallee);
        fs.addPet(0, rex);
        List<Pet> pets = new ArrayList<>();
        pets.add(Wallee);
        pets.add(rex);
        assertTrue(fs.getPets(0).contains(pets.get(0)));
        assertTrue(fs.getPets(0).contains(pets.get(1)));
        assertEquals(2, fs.getPets(0).size());

    }

}