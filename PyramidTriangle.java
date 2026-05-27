import java.util.Scanner;

public class PyramidTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = scanner.nextInt();

        for (int row = 1; row <= numberOfRows; row++) {

            // spaces
            for (int space = 1; space <= numberOfRows - row; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}