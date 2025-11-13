package questions.programs;

import java.util.Scanner;

public class FactorialOFNumber_Function {

    public static void factorial(int num)
    {
        int fact =1;
        if(num<0) {
            System.out.println("Enter a positive integer number");
            return;
        }
        else if (num==0) {
            fact = 1;
        }
        else
        {
            for (int i =num; i >=1 ; i--) {
                fact *=i;
            }
        }
        System.out.printf("Factorial of number %d is %d", num,fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt())
        {
            int number = sc.nextInt();
            factorial(number);
        }
        else
        {
            System.out.println("Enter an integer number");
        }

    }
}
