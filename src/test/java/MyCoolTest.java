import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCoolTest {
    @Test
    void shouldDoSomething(){
        LeapYear leapYear = new LeapYear();
        assertEquals(leapYear.isLeapYear(2023), false);
        assertEquals(leapYear.isLeapYear(2000), true);
        assertEquals(leapYear.isLeapYear(1998), false);
        assertEquals(leapYear.isLeapYear(1600), true);
        assertEquals(leapYear.isLeapYear(1700), false);
    }
}
