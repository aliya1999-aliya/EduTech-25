import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units used: ");
        int unitsUsed = scanner.nextInt();

        int billAmount;

        // Using bitwise operator
        if (unitsUsed <= 200) {
            billAmount = 0;
        } 
        else if (unitsUsed <= 300) {
            billAmount = 50;
        } 
        else if (unitsUsed > 1000) {

            // divide by 2 using right shift
            int extraUnits = unitsUsed - 1000;

            // multiply by 4 using left shift
            billAmount = (extraUnits << 2) + 500;
        } 
        else {
            billAmount = 200;
        }

        System.out.println("Bill Amount = " + billAmount);
    }
}