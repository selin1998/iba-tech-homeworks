package homework6;

public class Main {
    public static void main(String[] args) {


        Pet pet1 = new Pet(Species.HAMSTER, "Kuzya", 1, 25, new String[]{"eating nuts", "riding the wheel"});
        System.out.println(pet1);
        pet1.eat();
        pet1.foul();
        pet1.respond();
        Human Emil = new Human("Emil", "Aliyev", 1975);
        Human Sevinj = new Human("Sevinj", "Aliyeva", 1983);
        Family f1 = new Family(Sevinj, Emil);
        Human Aylin = new Human("Aylin", "Aliyeva", 2007, 120, new String[][]{{DaysOfWeek.MONDAY.name(), "play chess"}, {DaysOfWeek.SATURDAY.name(), "play piano"}, {DaysOfWeek.WEDNESDAY.name(), "do wrestling"}});
        f1.addChild(Aylin);
        f1.setPet(pet1);
        //    System.out.println(Aylin.getFamily());
        Aylin.welcomeTheFavorite();
        Aylin.describeTheFavorite();
        System.out.println(Aylin.toString());
        Human Hasan = new Human("Hasan", "Aliyev", 2010);
        f1.addChild(Hasan);
        System.out.println(f1.countFamily());
        System.out.println(f1.toString());


        //////////////////////

        Pet cat1 = new Pet(Species.CAT, "Leopold", 3, 55, new String[]{"playing with ball", "smelling Valerian root", "sleeping"});

        Human h1 = new Human("Leyla", "Memmedova", 1972);
        Human h2 = new Human("Memmed", "Memmedov", 1975);
        Human h3 = new Human("Nermin", "Memmedova", 1998, 140, new String[][]{{DaysOfWeek.FRIDAY.name(), "check emails"}, {DaysOfWeek.THURSDAY.name(), "watch Netflix"}});

        Family f2 = new Family(h1, h2);
        System.out.println(f2.toString());
        f2.addChild(h3);
        System.out.println(f2.toString());
        f2.deleteChild(h3);
        System.out.println(f2.toString());
        f2.setPet(cat1);
        System.out.println(f2.toString());
        System.out.println(cat1.getFamily());

        h1.feed(false);

        Human father = new Human("Rodrigo", "Borgia", 1431);
        Human mother = new Human("Vannozza", "Cattenei", 1442);


// // ******* Test finalize() method ********** Uncomment to see!
//
//        while(true){
//            new Human("Sub","Zero",1950);
//            new Pet(Species.FISH,"Nemo");
//            new Family(mother,father);
//        }
//


    }


}
