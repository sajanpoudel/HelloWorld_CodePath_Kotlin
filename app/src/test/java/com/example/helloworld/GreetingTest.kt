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

    @Test
    fun earlyHoursAreNight() {
        assertEquals(TimeOfDay.NIGHT, Greeting.timeOfDay(0))
        assertEquals(TimeOfDay.NIGHT, Greeting.timeOfDay(4))
    }

    @Test
    fun hoursWrapAroundTheDay() {
        assertEquals(TimeOfDay.MORNING, Greeting.timeOfDay(29))
        assertEquals(TimeOfDay.NIGHT, Greeting.timeOfDay(24))
    }

    @Test
    fun negativeHoursWrapBackwards() {
        assertEquals(TimeOfDay.EVENING, Greeting.timeOfDay(-5))
        assertEquals(TimeOfDay.NIGHT, Greeting.timeOfDay(-1))
    }

    @Test
    fun everyHourOfTheDayHasAPartOfTheDay() {
        val counts = (0..23).groupingBy { Greeting.timeOfDay(it) }.eachCount()
        assertEquals(7, counts[TimeOfDay.MORNING])
        assertEquals(5, counts[TimeOfDay.AFTERNOON])
        assertEquals(4, counts[TimeOfDay.EVENING])
        assertEquals(8, counts[TimeOfDay.NIGHT])
    }
}
