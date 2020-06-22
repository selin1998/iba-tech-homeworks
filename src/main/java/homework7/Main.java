package homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] humanScedule = {
                {DaysOfWeek.SATURDAY.name(), "to do aikido"},
                {DaysOfWeek.SUNDAY.name(), "chilling"}
        };

        Woman w = new Woman("Marie", "Claire", 1988, 140, humanScedule);
        Fish fish1 = new Fish();
        fish1.foul();
        fish1.respond();
        RoboCat r = new RoboCat("Wallee");
        Fish fish = new Fish("Nemo", 1, 10, new String[]{"swimming", "breathing"});
        Dog dog = new Dog("Tuzik", 5, 40, new String[]{"barking", "protecting house", "moving the tail"});
        DomesticCat cat = new DomesticCat("Barsik", 4, 60, new String[]{"sleeping", "washing himself", "smelling Valerian"});
        dog.respond();
        dog.foul();
        cat.respond();
        cat.foul();
        r.respond();
        r.foul();


        Man Emil = new Man("Emil", "Aliyev", 1975, 140, null);
        Woman Sevinj = new Woman("Sevinj", "Aliyeva", 1983, 90, null);
        Family f1 = new Family(Sevinj, Emil);
        Woman Aylin = new Woman("Aylin", "Aliyeva", 2007, 120, new String[][]{{DaysOfWeek.MONDAY.name(), "play chess"}, {DaysOfWeek.SATURDAY.name(), "play piano"}, {DaysOfWeek.WEDNESDAY.name(), "do wrestling"}});
        f1.addChild(Aylin);
        f1.setPet(cat);

        Aylin.greet();
        Sevinj.bakery();
        Aylin.describeTheFavorite();
        Emil.greet();


        System.out.println(f1.bornChild()); // implement
        System.out.println(Arrays.toString(f1.getChildren()));


    }
}
