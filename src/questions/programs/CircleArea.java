package questions.programs;
import java.util.*;

public class CircleArea {
        public static void main(String[] args) {
            final double pi = 3.14f;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a value for radius");
            if(scanner.hasNextDouble())
            {
                double radius = scanner.nextDouble();
                if (radius <=0) {
                    System.out.println("Enter a positive number greater than 0");
                }
                else
                {
                    double area = pi*(radius*radius);
                    System.out.println(area);
                }
            }
            else
                System.out.println("Enter a valid value");


        }
}
