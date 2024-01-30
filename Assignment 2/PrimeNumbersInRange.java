import java.util.Scanner;

public class PrimeNumbersInRange{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.println("Prime numbers between 2 and " + N + " are:");
        printPrimeNumbers(N);

        scanner.close();
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print prime numbers up to N
    static void printPrimeNumbers(int N) {
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}