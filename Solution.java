package problemSolving;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // int age = 25;
        // String name = "John";
        // double salary = 50000.50;
        
        // System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);

        int age = input.nextInt();
        String name = input.next();
        double salary = input.nextDouble();

        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n",name,age,salary);
        System.out.printf("%10s", "Hello"); // "     Hello"
        System.out.println();
        System.out.printf("%.2f", 3.14159); // "3.14"
        System.out.println();
        System.out.printf("%-10s", "Hello"); // "Hello     "

    }
}



