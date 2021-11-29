package hacker_rank.update_needed.cat_and_mouse;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void catAShouldWin() {
        // Given
        int catA = 10;
        int catB = 12;
        int mouse = 9;

        // When
        final String result = Solution.catAndMouse(catA, catB, mouse);

        // Then
        assertEquals("Cat A", result);
    }

    @Test
    public void catBShouldWin() {
        // Given
        int catA = 10;
        int catB = 12;
        int mouse = 13;

        // When
        final String result = Solution.catAndMouse(catA, catB, mouse);

        // Then
        assertEquals("Cat B", result);
    }

    @Test
    public void mouseShouldEscape() {
        // Given
        int catA = 10;
        int catB = 12;
        int mouse = 11;

        // When
        final String result = Solution.catAndMouse(catA, catB, mouse);

        // Then
        assertEquals("Mouse C", result);
    }
}