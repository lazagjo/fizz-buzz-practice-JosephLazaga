package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void should_return_number_when_equals_given_ordinary_number() {
        //give
        FizzBuzz student = new FizzBuzz();
        String expectedMessage = "1";

        //when
        String actualMessage = student.callNumber(1);

        //then
        assertEquals(expectedMessage,actualMessage);
     }

    @Test
    void should_return_fizz_when_divisible_given_3() {
        //give
        FizzBuzz student = new FizzBuzz();
        String expectedMessage = "Fizz";

        //when
        String actualMessage = student.callNumber(3);

        //then
        assertEquals(expectedMessage,actualMessage);
     }
}
