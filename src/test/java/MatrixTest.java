import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MatrixTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;

    //TODO Before doing Task 1 remove "/*" and "*/" (Shortcut: Ctrl + Shift + /).


    @Test
    public void testIndexesOfNullColumns() {
        int[][] matrix = {
                {-27, 0,  -22, -21, 0},
                {-24, 0, -100, -94, 0},
                { 15, 0,   69, -38, 0},
                {-56, 0,    3, -68, 0},
                { 30, 0,  -92,  50, 0}
        };

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);

        ArrayList<Integer> actual = Matrix.indexesOfNullColumns(matrix);

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void testIndexOfMaximum() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        int[] actual = Matrix.indexOfMaximum(matrix);

        assertEquals(2, actual.length);
        assertEquals(0, actual[0]);
        assertEquals(4, actual[1]);
    }

}
