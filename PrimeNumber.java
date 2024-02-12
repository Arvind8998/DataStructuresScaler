import java.util.Scanner;

public class PrimeNumber {
    public static int getFactorsCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                count += 1;
            } else if (n % i == 0) {
                count += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int n = sc.nextInt();
        int factors = getFactorsCount(n);
        if (factors == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
