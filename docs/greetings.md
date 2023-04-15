# Greetings

The "Greet Me!" button picks its text from the hour of the day on the phone:

| Hours | Part of the day | String |
| --- | --- | --- |
| 5 to 11 | morning | `greeting_morning` |
| 12 to 16 | afternoon | `greeting_afternoon` |
| 17 to 20 | evening | `greeting_evening` |
| 21 to 4 | night | `greeting_night` |

`Greeting.timeOfDay(hour)` does the mapping and has plain JUnit tests in `app/src/test`. It needs no Android classes, so it can also be compiled and tested outside Android Studio:

```
kotlinc app/src/main/java/com/example/helloworld/TimeOfDay.kt \
        app/src/main/java/com/example/helloworld/Greeting.kt \
        app/src/test/java/com/example/helloworld/GreetingTest.kt \
        -cp junit.jar:hamcrest-core.jar -d out
java -cp out:kotlin-stdlib.jar:junit.jar:hamcrest-core.jar org.junit.runner.JUnitCore com.example.helloworld.GreetingTest
```
