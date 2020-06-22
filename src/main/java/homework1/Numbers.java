package homework1;

import java.util.Scanner;

public class Numbers {
    static int guess;


    public static void main(String[] args) {
        int temp = 0;
        int[] array = new int[100];
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Let the game begin!");
        int number = (int) (Math.random() * (100 + 1));

        System.out.println("Guess the number!");


        int i = 0;
        while (true) {
            // controls if input is integer
            if (sc.hasNextInt()) {
                guess = sc.nextInt();
                array[i] = guess;
                i++;


                if (guess < number) {
                    System.out.println("Your number is too small. Please, try again.");
                } else if (guess > number) {
                    System.out.println("Your number is too big. Please, try again.");
                } else {
                    System.out.printf("Congratulations, %s ! ", name);

                    System.out.print("Your numbers: ");


                    for (int k = 0; k < array.length; k++) {     // sort in descending order
                        for (int l = k + 1; l < array.length; l++) {
                            if (array[k] < array[l]) {
                                temp = array[k];
                                array[k] = array[l];
                                array[l] = temp;
                            }
                        }
                    }


                    for (int a = 0; a < i; a++) {
                        System.out.print(array[a] + " ");
                    }

                    break;
                }

            } else {
                System.out.println("Enter valid number: ");
                sc.next();
            }


        }

    }
}
