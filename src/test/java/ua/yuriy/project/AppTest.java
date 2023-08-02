package ua.yuriy.project;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;


public class AppTest {
private MatrixTest matrix = new MatrixTest(5,5);

    @Test
    public void checkNameOfObject() {
        Assert.assertEquals("Hello", matrix, matrix);
    }
    @Test
    public void generateMatrix() {
        int rows = matrix.getRows();
        int columns = matrix.getColumns();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(0, 20);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
