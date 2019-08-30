package picking_numbers;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static picking_numbers.Result.*;

public class ResultTest {

    @Test
    public void shouldMakeCount() {
        // Given
        List<Integer> integerList = Lists.newArrayList(1, 1, 1, 2, 2, 2, 3, 4, 5, 6);

        // When
        final int count = pickingNumbers(integerList);

        // Then
        assertEquals(6, count);
    }

    @Test
    public void shouldNotMakeCount() {
        // Given
        List<Integer> integerList = Lists.newArrayList(1, 3, 5, 7, 9);

        // When
        final int count = pickingNumbers(integerList);

        // Then
        assertEquals(1, count);
    }

    @Test
    public void shouldReturnZero() {
        // Given
        List<Integer> integerList = Collections.emptyList();

        // When
        final int count = pickingNumbers(integerList);

        // Then
        assertEquals(0, count);
    }
}