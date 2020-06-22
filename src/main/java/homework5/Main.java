package homework5;

public class Main {
    public static void main(String[] args) {


        Human Emil = new Human("Emil", "Aliyev", 1975);
        Human Sevinj = new Human("Sevinj", "Aliyeva", 1983);
        Family f1 = new Family(Sevinj, Emil);


        Pet pet1 = new Pet("hamster", "Kuzya", 1, 25, new String[]{"eating nuts", "riding the wheel"});
        pet1.eat();
        pet1.foul();
        pet1.respond();


        Human Aylin = new Human("Aylin", "Aliyeva", 2007, 120, new String[][]{{"Monday", "play chess"}, {"Saturday", "play piano"}, {"Sunday", "do wrestling"}});
        f1.addChild(Aylin);
        f1.setPet(pet1);
        System.out.println(Aylin.getFamily());


        Aylin.welcomeTheFavorite();
        Aylin.describeTheFavorite();
        System.out.println(Aylin);


        Human Hasan = new Human("Hasan", "Aliyev", 2010);
        f1.addChild(Hasan);
        System.out.println(f1.countFamily());
        System.out.println(f1.toString());


        //////////////////////


        Human h1 = new Human("Leyla", "Memmedova", 1972);
        Human h2 = new Human("Memmed", "Memmedov", 1975);
        Human h3 = new Human("Nermin", "Memmedova", 1998, 140, new String[][]{{"Tuesday", "check emails"}, {"Friday", "watch Netflix"}});

        Family f2 = new Family(h1, h2);

        Pet cat1 = new Pet("cat", "Leopold", 3, 55, new String[]{"playing with ball", "smelling Valerian root", "sleeping"});
        System.out.println(f2.toString());
        f2.addChild(h3);
        System.out.println(f2.toString());
        f2.deleteChild(0);
        System.out.println(f2.toString());
        f2.setPet(cat1);
        System.out.println(f2.toString());
        System.out.println(cat1.getFamily());

        h1.feed(false);


    }


}
