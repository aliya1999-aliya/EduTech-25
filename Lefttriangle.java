import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = scanner.nextInt();

        for (int row = 1; row <= numberOfRows; row++) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}