package hacker_rank.day_of_the_programmer;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest extends TestCase {

    public void testDayOfProgrammer_when2017_return13of09of2017() {

        // Given
        final int source = 2017;

        // When
        final String result = Result.dayOfProgrammer(source);

        // Then
        assertThat(result)
                .isEqualTo("13.09.2017");
    }
}