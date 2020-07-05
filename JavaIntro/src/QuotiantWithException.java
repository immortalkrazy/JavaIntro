import java.util.Scanner;

public class QuotiantWithException {

      public static void main(String[] args) {

            Scanner inputScanner = new Scanner(System.in);
            boolean continueInput = true;

            System.out.println("Please enter two numbers:  ");

            int number1 = inputScanner.nextInt();
            int number2 = inputScanner.nextInt();
            do {
                  try {
                        int result = quotient(number1, number2);
                        System.out.println(number1 + " / " + number2 + " is " + result);
                        continueInput = false;
                        inputScanner.close();

                  } catch (ArithmeticException e) {
                        System.out.println("Exception: An integer cannot be divided by zero");
                  }

            } while (continueInput);

      }

      public static int quotient(int num1, int num2) {

            if (num2 == 0) {
                  throw new ArithmeticException("Divisor cannot be zero");
            }

            return num1 / num2;
      }

}
