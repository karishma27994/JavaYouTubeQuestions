package questions.programs;

import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen.

public class NameArray_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        String names [] = new String[size];
        for(int i =0; i<size;i++)
        {
          /*  names[i] = sc.nextLine(); using this will take first value as null.
            // (Reason: nextInt() leaves a hidden newline and when pressed enter after inputting size, the newline
             still waiting inside Scanner’s buffer and when sees nextLine() it assumes as null input making first value as null or blank.
           */

            names[i] = sc.next();
        }
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        System.out.println(names.length);
    }
}
