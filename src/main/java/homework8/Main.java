package homework8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> sportSchedule = new HashMap<String, String>() {
            {
                put(DaysOfWeek.FRIDAY.name(), "go to aikido");
                put(DaysOfWeek.SUNDAY.name(), "ride bicycle");
            }
        };


        Woman w = new Woman("Marie", "Claire", 1988, 140, sportSchedule);
        System.out.println(w.getSchedule());
        Fish fish1 = new Fish();
        fish1.foul();
        fish1.respond();
        RoboCat r = new RoboCat("Wallee");
        Fish fish = new Fish("Nemo", 1, 10, new HashSet<String>(Arrays.asList("swimming", "breathing")));
        Dog dog = new Dog("Tuzik", 5, 40, new HashSet<String>(Arrays.asList("barking", "protecting house", "moving the tail")));
        DomesticCat cat = new DomesticCat("Barsik", 4, 60, new HashSet<String>(Arrays.asList("sleeping", "washing himself", "smelling Valerian", "rolling around")));
        System.out.println(cat.getHabits());
        dog.respond();
        dog.foul();
        cat.respond();
        cat.foul();
        r.respond();
        r.foul();


        Man Emil = new Man("Emil", "Aliyev", 1975);
        Woman Sevinj = new Woman("Sevinj", "Aliyeva", 1983);
        Family f1 = new Family(Sevinj, Emil);
        Map<String, String> map = Map.of(DaysOfWeek.SATURDAY.name(), "play chess", DaysOfWeek.THURSDAY.name(), "play piano", DaysOfWeek.WEDNESDAY.name(), "watch cartoon");
        Woman Aylin = new Woman("Aylin", "Aliyeva", 2007, 120, map);
        f1.addChild(Aylin);
        f1.setPet(new HashSet<Pet>(Arrays.asList(cat, fish)));


        Aylin.greet(dog);
        Sevinj.bakery();
        Aylin.describeTheFavorite();
        Emil.greet(cat);
        System.out.println(f1.getChildren());
        Woman Sevinj2 = new Woman("Sevinj", "Aliyeva", 1983);
        System.out.println(f1.toString());


    }
}
