package com.example.helloworld

import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTest {
    @Test
    fun morningStartsAtFive() {
        assertEquals(TimeOfDay.MORNING, Greeting.timeOfDay(5))
        assertEquals(TimeOfDay.MORNING, Greeting.timeOfDay(11))
    }
}
