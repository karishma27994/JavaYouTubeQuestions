package questions.programs;

import java.util.Scanner;

public class PrintTable_Function {
public static void printTable(int n)
{
    for (int i =1; i<=10; i++)
    {
        int table = n*i;
        System.out.printf("%d * %d= %d\n",n,i,table);
    }
}

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number to print a table");
        if (sc.hasNextInt())
        {
            int num = sc.nextInt();
            if (num<=0) {
                System.out.println("Enter a positive number greater than 0");
            }
            else {
                printTable(num);
            }
        }
        else System.out.println("Enter an integer number");
    }
}
