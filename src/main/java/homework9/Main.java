package homework9;

import homework9.controller.FamilyController;
import homework9.entity.family.Family;
import homework9.entity.human.Human;
import homework9.entity.pet.DomesticCat;
import homework9.entity.pet.Pet;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Rodrigo", "Borgia", 1431);
        Human mother = new Human("Vannozza", "Cattenei", 1442);
        Human son1 = new Human("Cezare", "Borgia", 1475);
        Human son2 = new Human("Giovanni", "Borgia", 1474);
        Human daughter = new Human("Lucrezia", "Borgia", 1480);


        Human simpson1 = new Human("Homer", "Simpson", 1951);
        Human simpson2 = new Human("Marge", "Simpson", 1953);
        Human simpson3 = new Human("Bart", "Simpson", 1977);
        Human simpson4 = new Human("Lisa", "Simpson", 1979);
        Human simpson5 = new Human("Maggie", "Simpson", 1986);


        Human curie1 = new Human("Pierre", "Curie", 1859);
        Human curie2 = new Human("Maria", "Sklodowska", 1867);
        Human curie3 = new Human("Irene-Joliot", "Curie", 1897);
        Human curie4 = new Human("Eve", "Curie", 1904);


        FamilyController fc = new FamilyController();


        fc.createNewFamily(mother, father);
        fc.createNewFamily(simpson2, simpson1);
        fc.createNewFamily(curie2, curie1);


        System.out.println("All families as a list:");
        System.out.println(fc.getAllFamilies());
        System.out.println("All families:");
        fc.displayAllFamilies();
        System.out.println("Number of families: " + fc.count());
        Family f1 = fc.getFamilybyId(0);
        Family f2 = fc.getFamilybyId(1);
        Family f3 = fc.getFamilybyId(2);

        fc.adoptChild(f1, son1);
        fc.adoptChild(f1, son2);
        fc.adoptChild(f1, daughter);
        fc.bornChild(f1, "Gioffre", "Laura");
        System.out.println("Modified Borgia Family:");
        System.out.println(f1);

        fc.adoptChild(f2, simpson3);
        fc.adoptChild(f2, simpson4);
        fc.adoptChild(f2, simpson5);
        System.out.println("Modified Simpson Family:");
        System.out.println(f2);

        fc.adoptChild(f3, curie3);
        fc.adoptChild(f3, curie4);
        System.out.println("Modified Curie Family:");
        System.out.println(f3);


        //borgia,simpson
        System.out.println(fc.getFamiliesBiggerThan(4));

        //curie,simpson
        System.out.println(fc.getFamiliesLessThan(6));

        //1
        System.out.println(fc.countFamiliesWithMemberNumber(4));

        Pet cat1 = new DomesticCat("Lucifer");
        fc.addPet(0, cat1);
        System.out.println(fc.getPets(0));


        fc.deleteFamilybyIndex(0);
        System.out.println("Families after deleting family with index 0:");
        fc.displayAllFamilies();

        // year is 1991, delete all children older than 10
        System.out.println("Families with kids younger than 10:");

        // only Maggie remains, she is 5 by 1991
        fc.deleteAllChildrenOlderThan(10,1991);
        fc.displayAllFamilies();


    }
}
