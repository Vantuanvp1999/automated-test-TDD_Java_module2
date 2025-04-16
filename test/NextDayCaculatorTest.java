import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class NextDayCaculatorTest {
    @Test
    void testNextDay() {
        String result = NextDayCaculator.findNextDay(1,1,2018);
        assertEquals("2/1/2018", result);
    }
    @Test
    void testNextDay2() {
        String result = NextDayCaculator.findNextDay(31,1,2018);
        assertEquals("1/2/2018", result);
    }
}