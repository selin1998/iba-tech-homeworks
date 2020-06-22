package homework2;

import java.util.Scanner;

public class ShootingAtTheSquare {


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


        StringBuilder str = new StringBuilder();

        char[][] square = new char[6][6];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                square[i][j] = '-';    // initialize with dashes
            }
        }


        int row = (int) (Math.random() * 5 + 1);
        int col = (int) (Math.random() * 5 + 1);

        Scanner sc = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
        int r, c;


        boolean b = false;

        while (!b) {


            System.out.println("Enter the row number:");
            r = sc.nextInt();
            System.out.println("Enter the column number:");
            c = sc.nextInt();

            if (r == row && c == col) {
                square[r][c] = 'x';
                System.out.println("You have won!");
                b = true; // if target is found, goes out of while loop
            } else {
                square[r][c] = '*';

            }

            System.out.println(print(square, str));
            str = new StringBuilder("");


        }


    }
}
