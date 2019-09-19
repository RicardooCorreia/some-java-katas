package minimum_distance;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shouldReturnTheMinimumDistance() {
        // Given
        int[] numbers = new int[]{7, 1, 3, 4, 1, 7};

        // When
        int result = Solution.minimumDistances(numbers);

        // Then
        assertEquals(3, result);
    }

    @Test
    public void shouldReturnNegative() {
        // Given
        int[] numbers = new int[]{7, 1, 3, 4, 2, 5};

        // When
        int result = Solution.minimumDistances(numbers);

        // Then
        assertEquals(-1, result);
    }
}