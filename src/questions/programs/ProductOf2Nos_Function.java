package questions.programs;

import java.util.Scanner;

public class ProductOf2Nos_Function {

    public static int product(int a, int b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Product of 2 nos is: " +product(num1,num2));
    }
}
