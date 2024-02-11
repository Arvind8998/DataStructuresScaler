import java.util.Scanner;

class factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to factorize: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println("Factor is " + i);
                count += 1;
            } else if (n % i == 0) {
                System.out.println("Factor is " + i);
                System.out.println("Factor is " + n / i);
                count += 2;
            }
        }
        System.out.println("Total no of factors are" + "\n" + count);
    }
}
