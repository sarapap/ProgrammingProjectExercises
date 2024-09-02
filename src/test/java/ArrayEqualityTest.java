import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 8 };
        assertArrayEquals(a1, a2, "Arrays should be equal, but they are not.");
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 14 } };
        assertArrayEquals(a11, a12, "Multi-dimensional arrays should be equal, but they are not.");
    }

    @Test
    public void testDifferentArrayEquality() {
        String[] s1 = { "hey", "everyone" };
        String[] s2 = { "hey", "everyone" };
        assertArrayEquals(s1, s2, "String arrays should be equal.");

        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals(d1, d2, "Double arrays should be equal.");
    }
}