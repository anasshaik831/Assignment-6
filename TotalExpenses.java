import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = calculateTotalExpenses(quantity, pricePerItem);

        if (totalExpenses == -1) {
            System.out.println("No discount applied. Total expenses: Rs." + (quantity * pricePerItem));
        } else {
            System.out.println("Total expenses: Rs." + totalExpenses);
        }

        scanner.close();
    }

    public static double calculateTotalExpenses(int quantity, double pricePerItem) {
        double totalExpenses;

        if (quantity > 50) {
            totalExpenses = quantity * pricePerItem * 0.9;
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses = quantity * pricePerItem * 0.95;
        } else {
            return -1;
        }

        return totalExpenses;
    }
}
