package Exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int number;
        int parSum = 0;
        int imparSum = 0;
        char choice;

        Scanner console = new Scanner(System.in);
        do {
            System.out.println("Enter the number:");
            number = console.nextInt();
            if (number % 2 == 0) {
                parSum += number;
            } else {
                imparSum += number;

            }
            System.out.println("DO you want to continue? y/n");
            choice = console.next().charAt(0);


        } while (choice == 'y' || choice == 'y');
        System.out.println("Sum of even numbers: " + parSum);
        System.out.println("Sum of Odd numbers: " + imparSum);

    }
}
