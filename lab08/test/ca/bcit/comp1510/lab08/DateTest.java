package ca.bcit.comp1510.lab08;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void testDate() {
        //invalid dates
        assertFalse(Date.isDateValid(29, 2, 2001));
        assertFalse(Date.isDateValid(0, 2, 2000));
        assertFalse(Date.isDateValid(32, 12, 2000));
        assertFalse(Date.isDateValid(31, 4, 2000));
        
        // valid dates
        assertTrue(Date.isDateValid(28, 2, 2001));
        assertTrue(Date.isDateValid(29, 2, 2000));
        assertTrue(Date.isDateValid(31, 12, 2000));
        assertTrue(Date.isDateValid(30, 4, 2000));
   }

    @Test
    void testIsMonthValid() {
        assertTrue(Date.isMonthValid(1));
        assertTrue(Date.isMonthValid(12));
        assertFalse(Date.isMonthValid(0));
        assertFalse(Date.isMonthValid(13));
    }

    @Test
    void testIsYearValid() {
        assertTrue(Date.isYearValid(1582));
        assertTrue(Date.isYearValid(2999));
        assertFalse(Date.isYearValid(1000));
        assertFalse(Date.isYearValid(3000));
    }

    @Test
    void testIsLeapYear() {
        assertTrue(Date.isLeapYear(2000)); // leap year
        assertFalse(Date.isLeapYear(2001)); // non-leap year
        assertFalse(Date.isLeapYear(1900)); // non-leap year
        assertTrue(Date.isLeapYear(2004)); // leap year
        assertFalse(Date.isLeapYear(2005)); // non-leap year
    }

    @Test
    void testDaysInMonth() {
        assertEquals(31, Date.daysInMonth(1, false));
        assertEquals(28, Date.daysInMonth(2, false));
        assertEquals(31, Date.daysInMonth(3, false));
        assertEquals(30, Date.daysInMonth(4, false));
        assertEquals(31, Date.daysInMonth(5, false));
        assertEquals(30, Date.daysInMonth(6, false));
        assertEquals(31, Date.daysInMonth(7, false));
        assertEquals(31, Date.daysInMonth(8, false));
        assertEquals(30, Date.daysInMonth(9, false));
        assertEquals(31, Date.daysInMonth(10, false));
        assertEquals(30, Date.daysInMonth(11, false));
        assertEquals(31, Date.daysInMonth(12, false)); 
        assertEquals(29, Date.daysInMonth(2, true));
    }

    @Test
    void testIsDateValid() {
        assertTrue(Date.isDateValid(1, 1, 2000));
        assertTrue(Date.isDateValid(29, 2, 2000));
        assertTrue(Date.isDateValid(31, 1, 2000));
        assertFalse(Date.isDateValid(0, 1, 2000));
        assertFalse(Date.isDateValid(32, 1, 2000));
        assertFalse(Date.isDateValid(30, 2, 2000));
        assertFalse(Date.isDateValid(29, 2, 1900));
        assertFalse(Date.isDateValid(31, 4, 2000));
        assertFalse(Date.isDateValid(31, 6, 2000));
        assertFalse(Date.isDateValid(31, 9, 2000));
        assertFalse(Date.isDateValid(31, 11, 2000));
    }

    

}
