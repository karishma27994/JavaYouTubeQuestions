package questions.programs;
import java.util.Scanner;

public class FirstOccurrenceOfNumber_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input rows and columns of 2D array");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int array[][] = new int [rows][cols];
        for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = sc.nextInt();
                }
        }
        System.out.println("Print the values inputted in 2D array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Input number that needs to be searched in the array");
        int x = sc.nextInt();
        boolean found = false;
        outer: for (int i = 0; i < rows; i++) {
            inner: for (int j = 0; j < cols; j++) {
                if(array[i][j] == x)
                {
                    System.out.println("x found at index: ("+ i + "," + j+")");
                    found = true;
                    break outer;
                }
            }
        }
        if(!found) {
            System.out.println("Searched number not found in the array");
        }
    }
}

