package homework10;

import homework10.entity.human.Human;
import homework10.entity.human.Woman;

public class Main {
    public static void main(String[] args) {


        Human h1 = new Human("Corona", "Virus", 1580500800000L);
        System.out.println(h1);
        System.out.println(h1.describeAge());

        Human h2=new Woman("Billie","Eilish",1008633600000L);
        System.out.println(h2);
        System.out.println(h2.describeAge());

        Human adoptedChild = new Human("Oliver", "Twist", "02/03/1837", 105);
        System.out.println(adoptedChild);
        System.out.println(adoptedChild.describeAge());

        Human baby= new Human("Matilda","Leon","20/03/2016",60);
        System.out.println(baby);
        System.out.println(baby.describeAge());


    }


    }

