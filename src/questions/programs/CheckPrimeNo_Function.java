package questions.programs;
import java.util.*;

public class CheckPrimeNo_Function {
    static void primeNo(int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.printf("%d is not a prime no", n);
                break;
            }
        }

            if (n == i) {
                System.out.printf("%d is a prime no", n);
            }
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if (sc.hasNextInt())
        {
            int num = sc.nextInt();
            if(num<=1)
            {
                System.out.println("Enter a positive number greater than 1");
            }
            else
            {
                primeNo(num);
            }
        }
        else
        {
            System.out.println("Enter an integer number");
        }
    }
}
