import java.util.Scanner;

public class number_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter numbers. Type 'stop' to terminate.");

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                continueInput = false;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    count++;
                    sum += number;
                    if (number > largest) {
                        largest = number;
                    }
                    if (number < smallest) {
                        smallest = number;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'stop' to finish.");
                }
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Average of all numbers entered: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
