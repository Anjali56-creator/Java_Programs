//to check whether a number is prime or not using command line argument.
public class PrimeCheck {

    public static void main(String[] args) {

        // Check if argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true;

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
