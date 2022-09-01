package tdd.fizzbuzz;

public class FizzBuzz {
    public String callNumber(int order) {
        String message = "";

        if (order % 3 == 0) {
            message = message + "Fizz";
        }

        if (order % 5 == 0) {
            message = message + "Buzz";
        }

        if (order % 7 == 0) {
            message = message + "Whizz";
        }

        if (order % 3 != 0 && order % 7 != 0 && order % 5 != 0){
            message = String.valueOf(order);
        }

        return message;
    }
}
