package questions.programs;

import java.util.Scanner;

public class CheckEvenNo_Function {
   static boolean checkEvenOrOdd(int n)
    {
        return (n%2 ==0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if (sc.hasNextInt())
        {
            int num = sc.nextInt();
           boolean result = checkEvenOrOdd(num);
           if (result)
           {
               System.out.println("Even number is: " + num);
           }
            else System.out.println("Odd number is: " + num);
        }
        else System.out.println("Enter an integer number");
    }
}
