package com.example.helloworld

import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTest {
    @Test
    fun morningStartsAtFive() {
        assertEquals(TimeOfDay.MORNING, Greeting.timeOfDay(5))
        assertEquals(TimeOfDay.MORNING, Greeting.timeOfDay(11))
    }

    @Test
    fun afternoonRunsFromNoonToFour() {
        assertEquals(TimeOfDay.AFTERNOON, Greeting.timeOfDay(12))
        assertEquals(TimeOfDay.AFTERNOON, Greeting.timeOfDay(16))
    }

    @Test
    fun eveningRunsFromFiveToEight() {
        assertEquals(TimeOfDay.EVENING, Greeting.timeOfDay(17))
        assertEquals(TimeOfDay.EVENING, Greeting.timeOfDay(20))
    }

    @Test
    fun lateHoursAreNight() {
        assertEquals(TimeOfDay.NIGHT, Greeting.timeOfDay(21))
        assertEquals(TimeOfDay.NIGHT, Greeting.timeOfDay(23))
    }
}
