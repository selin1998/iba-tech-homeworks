package homework3;

import java.util.Scanner;

public class WeekPlannerAdvanced {

    public static void main(String[] args) {


        final String[][] schedule = {
                {"Sunday", "do home work"},
                {"Monday", "go to courses, watch a film"},
                {"Tuesday", "do programming"},
                {"Wednesday", "learn German"},
                {"Thursday", "do aerobics"},
                {"Friday", "watch anime"},
                {"Saturday", "do housework"}


        };

        Scanner sc = new Scanner(System.in);
        String day = "";

        outerloop:
        while (true) {
            System.out.println("Please, input the day of the week: ");
            day = (sc.nextLine()).trim().toLowerCase();
            if (day.equals("exit")) {
                break outerloop;
            }
            String control = day.substring(0, 6).toLowerCase();


            switch (control) {

                case "change":
                    String weekday = day.substring(7).trim().toLowerCase();
                    System.out.printf("Please, input new tasks for %s\n", weekday);
                    String tasks = sc.nextLine();
                    for (String[] element : schedule) {


                        if (element[0].toLowerCase().equals(weekday)) {

                            element[1] = tasks;
                            continue outerloop;
                        }
                    }
                    break;


            }


            switch (day) {
                case "sunday":
                    System.out.printf("Your task for %s is : %s \n", schedule[0][0], schedule[0][1]);
                    break;
                case "monday":
                    System.out.printf("Your task for %s is : %s \n", schedule[1][0], schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.printf("Your task for %s is : %s \n", schedule[2][0], schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.printf("Your task for %s is : %s \n", schedule[3][0], schedule[3][1]);
                    break;
                case "thursday":
                    System.out.printf("Your task for %s is : %s \n", schedule[4][0], schedule[4][1]);
                    break;
                case "friday":
                    System.out.printf("Your task for %s is : %s \n", schedule[5][0], schedule[5][1]);
                    break;
                case "saturday":
                    System.out.printf("Your task for %s is : %s \n", schedule[6][0], schedule[6][1]);
                    break;
                case "exit":
                    break outerloop;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");


            }

        }


    }
}
