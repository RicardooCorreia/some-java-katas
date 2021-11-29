package hacker_rank.update_needed.angry_professor;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shouldCancelClass() {
        // Given
        int[] studentTimes = new int[]{-1, -2, -3, 1, 2, 3};
        int studentsToStartClass = 4;

        // When
        String result = Solution.angryProfessor(studentsToStartClass, studentTimes);

        // Then
        assertEquals("YES", result);
    }

    @Test
    public void shouldStartClass() {
        // Given
        int[] studentTimes = new int[]{-1, -2, -3, 1, 2, 3};
        int studentsToStartClass = 3;

        // When
        String result = Solution.angryProfessor(studentsToStartClass, studentTimes);

        // Then
        assertEquals("NO", result);
    }

    @Test
    public void shouldConsiderStudentsThatArriveOnZero() {
        // Given
        int[] studentTimes = new int[]{0, 0, 0, 1, 2, 3};
        int studentsToStartClass = 3;

        // When
        String result = Solution.angryProfessor(studentsToStartClass, studentTimes);

        // Then
        assertEquals("NO", result);
    }
}