package values;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        // Take 15 integer inputs from the user and store them in the array
        
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        //printing the values in the array
        System.out.println("Values in the array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //asking for inputs to check if the number is present
        System.out.println("Enter a number to search:");
        int number = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (array[i] == number) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        //creating array and coping in reverse
        int[] reversedArray = new int[15];
        for (int i = 0; i < 15; i++) {
            reversedArray[i] = array[15 - 1 - i];
        }
        System.out.println("Values in the reversed array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        //calculation of the elements of your array
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }
}