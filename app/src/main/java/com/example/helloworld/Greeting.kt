package com.example.helloworld

/** Picks the greeting that fits an hour of the day. */
object Greeting {
    /** Morning is 5 to 11, afternoon 12 to 16, evening 17 to 20 and night is the rest. */
    fun timeOfDay(hour: Int): TimeOfDay {
        return when (((hour % 24) + 24) % 24) {
            in 5..11 -> TimeOfDay.MORNING
            in 12..16 -> TimeOfDay.AFTERNOON
            in 17..20 -> TimeOfDay.EVENING
            else -> TimeOfDay.NIGHT
        }
    }
}
