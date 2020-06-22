package homework13.console;

public class FillWithTestData implements Command {
    @Override
    public int serialNo() {
        return 1;
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execution() {
//
//        Human father = new Human("John", "Smith", 595281600000L);
//        Human mother = new Human("Mary", "Smith", 655934400000L);
//        Human son1 = new Man("Mark", "Smith", 1339700400000L);
//        Human son2 = new Man("Jacob", "Smith", 1398020400000L);
//        Human daughter= new Woman("Emily", "Smith", 1516478400000L);
//
//
//        Human father2 = new Human("Leo", "Ricardo", 595080600000L);
//        Human mother2 = new Human("Leona", "Ricarda", 654914400000L);
//        Human daughter2= new Woman("Luna", "Ricarda", 1506428400000L);
//
//        DomesticCat cat= new DomesticCat("Leopold",4,60, new HashSet<String>(Arrays.asList("sleeping","washing himself","smelling Valerian","rolling around")));


        console.printLn("Database is filled with test data...");
        fc.loadData();


        //   Family fam=new Family(mother,father);
//        fc.createNewFamily(mother,father);
//        fc.adoptChild( fc.getFamilybyId(0),son1);
//        fc.adoptChild( fc.getFamilybyId(0),son2);
//        fc.adoptChild( fc.getFamilybyId(0),daughter);
//        fc.getFamilybyId(0).addPet(cat);
//
//
//
//        //  Family fam2=new Family(mother2,father2);
//        fc.createNewFamily(mother2,father2);
//        fc.adoptChild(fc.getFamilybyId(1),daughter2);

            }

        }



