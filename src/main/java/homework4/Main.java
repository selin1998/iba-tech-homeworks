package homework4;

public class Main {

    public static void main(String[] args) {

        Pet pet1 = new Pet("hamster", "Kuzya", 1, 25, new String[]{"eating nuts", "riding the wheel"});
        pet1.eat();
        pet1.foul();
        pet1.respond();
        Human Emil = new Human("Emil", "Aliyev", 1975);
        Human Sevinj = new Human("Sevinj", "Aliyeva", 1983);
        Human Aylin = new Human("Aylin", "Aliyeva", 2007, Sevinj, Emil, 120, pet1, new String[][]{{"Monday", "play chess"}, {"Saturday", "play piano"}, {"Sunday", "do wrestling"}});
        Aylin.greetPet();
        Aylin.describePet();
        System.out.println(Aylin.toString());

        //////////////////////

        Pet cat1 = new Pet("cat", "Leopold", 3, 55, new String[]{"playing with ball", "smelling Valerian root", "sleeping"});
        Human h1 = new Human("Leyla", "Memmedova", 1972);
        Human h2 = new Human("Memmed", "Memmedov", 1975);
        Human h3 = new Human("Nermin", "Memmedova", 1998, h1, h2, 140, cat1, new String[][]{{"Tuesday", "check emails"}, {"Friday", "watch Netflix"}});
        h3.feedPet(false);
        System.out.println(h3.toString());

        //////////////////////

        Human Selin = new Human();
        Human billie = new Human("Billie", "Eilish", 2001);
        Human Naka = new Human("Nailya", "Memmedova", 1998, h1, h2);

        //////////////////////


        Pet dog1 = new Pet();
        Pet cat2 = new Pet("Jupiter", "cat");
        cat2.respond();
    }


}
