package homework2;

import java.util.Random;
import java.util.Scanner;

public class ShootingAtSquareAdvanced {

    // method for printing square

    public static StringBuilder print(char[][] array, StringBuilder str) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    str.append(i + " | ");
                } else if (i == 0 && j != 0) {
                    str.append(j + " | ");
                } else {
                    str.append(array[i][j] + " | ");
                }

            }
            str.append("\n");
        }


        return str;
    }


    public static void main(String[] args) {


        int row, col, counter = 0;
        Random random = new Random();

        boolean vertical = random.nextBoolean(); // random boolean to determine if targets will be in vertical or horizontal position


        int[][] target = new int[3][2];

        StringBuilder str = new StringBuilder();

        char[][] square = new char[6][6];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                square[i][j] = '-';
            }
        }


        if (vertical) { // if true target is in vertical position
            row = (int) (Math.random() * 3 + 1);
            col = (int) (Math.random() * 5 + 1);
            target[0][0] = row;
            target[0][1] = col;
            target[1][0] = row + 1;
            target[1][1] = col;
            target[2][0] = row + 2;
            target[2][1] = col;

        } else {  // if false in horizontal position
            row = (int) (Math.random() * 5 + 1);
            col = (int) (Math.random() * 3 + 1);
            target[0][0] = row;
            target[0][1] = col;
            target[1][0] = row;
            target[1][1] = col + 1;
            target[2][0] = row;
            target[2][1] = col + 2;


        }


        Scanner sc = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
        int r, c;


        boolean b = false;

        while (!b) {


            System.out.println("Enter the row number:");
            r = sc.nextInt();
            System.out.println("Enter the column number:");
            c = sc.nextInt();
            square[r][c] = '*';

            outerloop:
            for (int[] element : target) {

                if (r == element[0] && c == element[1]) {
                    square[r][c] = 'x';
                    counter++;
                    if (counter == 3) {
                        System.out.println("You have won!");
                        b = true;
                    } else {
                        System.out.println("You have damaged. Continue!");

                    }

                    break outerloop;
                }


            }


            System.out.println(print(square, str));
            str = new StringBuilder("");


        }


    }


}




