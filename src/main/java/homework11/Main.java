package homework11;

import homework11.controller.FamilyController;
import homework11.entity.family.Family;
import homework11.entity.human.Human;

public class Main {
    public static void main(String[] args) {


        Human father = new Human("Rodrigo", "Borgia", -17009222400000L);
        Human mother = new Human("Vannozza", "Cattenei", -16662067200000L);
        Human son1 = new Human("Cezare", "Borgia", -15620688000000L);
        Human son2 = new Human("Giovanni", "Borgia", -15652224000000L);
        Human daughter = new Human("Lucrezia", "Borgia", -15462921600000L);



        Human father2 = new Human("b", "b", 595281600000L);
        Human mother2 = new Human("c", "d", 655934400000L);
        Human son3 = new Human("e", "f", 1339700400000L);
        Human son4 = new Human("g", "h", 1398020400000L);
        Human daughter2 = new Human("i", "j", 1516478400000L);


        FamilyController fc = new FamilyController();


        fc.createNewFamily(mother, father);
        fc.createNewFamily(mother2, father2);


        System.out.println("All families as a list:");
        System.out.println(fc.getAllFamilies());
        System.out.println("All families:");
        fc.displayAllFamilies();
        System.out.println("Number of families: " + fc.count());
        Family f1 = fc.getFamilybyId(0);
        Family f2 = fc.getFamilybyId(1);

        fc.adoptChild(f1, son1);
        fc.adoptChild(f1, son2);
        fc.adoptChild(f1, daughter);
        fc.bornChild(f1, "Gioffre", "Laura");
        System.out.println("Modified Borgia Family:");
        System.out.println(f1);


        fc.adoptChild(f2, son3);
        fc.adoptChild(f2, son4);
        fc.adoptChild(f2, daughter2);


        System.out.println(fc.getFamiliesBiggerThan(4));


        System.out.println(fc.getFamiliesLessThan(6));


        System.out.println(fc.countFamiliesWithMemberNumber(5));


        fc.deleteFamilybyIndex(0);
        System.out.println("Families after deleting family with index 0:");
        fc.displayAllFamilies();


        System.out.println("Children before deleting:");
        System.out.println(f2.getChildren());


        fc.deleteAllChildrenOlderThan(4);


        System.out.println("Children older than 4 deleted:");
        System.out.println(f2.getChildren());

        f2.getChildren().stream().forEach(x-> System.out.println(x.age()));

       fc.displayAllFamilies();



    }


    }

