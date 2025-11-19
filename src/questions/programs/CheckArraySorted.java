package questions.programs;
import java.util.Scanner;

public class CheckArraySorted {
    //Take an array of numbers as input and check if it is an array sorted in ascending order.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        boolean ascending = true;
        for (int i = 0; i <arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                ascending = false;
            }
        }
        if(ascending==true)
        {
            System.out.println("Array is sorted in ascending order");
        }
        else {
            System.out.println("Array is not sorted in ascending order");
        }

    }
}
