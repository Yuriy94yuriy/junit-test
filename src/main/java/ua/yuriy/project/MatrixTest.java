package ua.yuriy.project;

import java.util.concurrent.ThreadLocalRandom;

public class MatrixTest {

    private final int[][] matrix;
    private int rows;
    private int columns;
    public double average;

    public int getRows() {
        return rows;
    }

    public int setRows(int rows) {
        this.rows = rows;
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int setColumns(int columns) {
        this.columns = columns;
        return columns;
    }

    public MatrixTest(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public int[][] generateMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(0, 20);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        return matrix;
    }

    public static boolean isSquared(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        for (int[] row : matrix) {
            if (row == null) {
                return false;
            }
            if (row.length != matrix.length) {
                return false;
            }
        }
        return true;
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }
        average = (int) (sum / (rows * columns));
        return average;
    }

    public static void main(String[] args) {
        MatrixTest matrix = new MatrixTest(4, 4);
        System.out.println();
        System.out.println("Matrix type: " + MatrixTest.isSquared(matrix.generateMatrix()) +
                           " True - square " +
                           "False - not square ");
        System.out.println(matrix.calculateAverage());
    }
}


//Додайте метод, який буде рахувати середнє арифметичне елементів масиву.
//Зробіть метод, який прийматиме на вхід двомірну матрицю (двовимірний масив) та перевіряти чи є вона квадратною
//В тестовому класі створіть тестову матрицю та передайте її в метод тестованого класу