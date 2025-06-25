import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows:");
        int rows = sc.nextInt();
        System.out.print("Number of Column:");
        int column = sc.nextInt();

        int[][] numbers = new int[rows][column];

        for (int i = 0; i < rows; i++) { // INPUT
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral Order:");

        int rowStart = 0;
        int rowEnd = rows - 1;
        int columnStart = 0;
        int columnEnd = column - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {

            for (int col = columnStart; col <= columnEnd; col++) {
                System.out.print(numbers[rowStart][col] + " ");
            }
            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(numbers[row][columnEnd] + " ");
            }
            columnEnd--;

            for (int col = columnEnd; col >= columnStart; col--) {
                System.out.print(numbers[rowEnd][col] + " ");
            }
            rowEnd--;

            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(numbers[row][columnStart] + " ");
            }
            columnStart++;
            System.out.println();
        }
        sc.close();
    }

}
