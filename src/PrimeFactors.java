import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        generate();
    }

    public static void generate() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }
}
