import java.util.Scanner;

public class commonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
            System.out.println("Enter number a:");
            a = sc.nextInt();
            System.out.println("Enter number b:");
            b = sc.nextInt();

            a = Math.abs(a);
            b = Math.abs(b);

            if (a == 0 || b == 0) {
                System.out.println("There is no common divisor");
            } else {
                while (a != b) {
                    if (a > b)
                        a = a - b;
                    else
                        b = b - a;
                }
            }
            System.out.println("Greatest common factor: " + a);
        } while (true);
    }
}
