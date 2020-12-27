package programingByDoing.functions;

public class FindingPrimeNumber {

    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " - is prime");
            } else {
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime(int n) {
        // if n is smaller then 2, is not a prime number
        // because 1 and 0 is not a prime
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            // if n is divisible with many numbers,
            // out of n or 1
            // is not a prime number
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
