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
     
     @Test
     void should_return_buzz_when_divisible_given_5() {
         //give
         FizzBuzz student = new FizzBuzz();
         String expectedMessage = "Buzz";

         //when
         String actualMessage = student.callNumber(5);

         //then
         assertEquals(expectedMessage,actualMessage);
      }

      @Test
      void should_return_whizz_when_divisible_given_7() {
          //give
          FizzBuzz student = new FizzBuzz();
          String expectedMessage = "Whizz";

          //when
          String actualMessage = student.callNumber(7);

          //then
          assertEquals(expectedMessage,actualMessage);
       }

       @Test
       void should_return_FizzBuzz_when_divisible_given_3_and_5() {
           //give
           FizzBuzz student = new FizzBuzz();
           String expectedMessage = "FizzBuzz";

           //when
           String actualMessage = student.callNumber(15);

           //then
           assertEquals(expectedMessage,actualMessage);
        }

        @Test
        void should_return_fizz_whizz_when_divisible_given_3_and_7() {
            //give
            FizzBuzz student = new FizzBuzz();
            String expectedMessage = "FizzWhizz";

            //when
            String actualMessage = student.callNumber(21);

            //then
            assertEquals(expectedMessage,actualMessage);
         }

         @Test
         void should_return_buzz_whizz_when_divisible_given_5_and_7() {
             //give
             FizzBuzz student = new FizzBuzz();
             String expectedMessage = "BuzzWhizz";

             //when
             String actualMessage = student.callNumber(35);

             //then
             assertEquals(expectedMessage,actualMessage);
          }

          @Test
          void should_return_fizz_buzz_whizz_when_divisible_given_3_5_7() {
              //give
              FizzBuzz student = new FizzBuzz();
              String expectedMessage = "FizzBuzzWhizz";

              //when
              String actualMessage = student.callNumber(105);

              //then
              assertEquals(expectedMessage,actualMessage);
           }
}
