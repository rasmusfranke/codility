package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockTest {
    private final Clock clock = new Clock();

    @Test
    public void t1() {
        assertEquals("23:18", clock.solution(1, 8, 3, 2));
    }

    @Test
    public void t2() {
        assertEquals("20:40", clock.solution(2, 4, 0, 0));
    }

    @Test
    public void t3() {
        assertEquals("07:30", clock.solution(3, 0, 7, 0));
    }

    @Test
    public void t4() {
        assertEquals("NOT POSSIBLE", clock.solution(9, 1, 9, 7));
    }
}
