import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number U wanna check?");
            int number = sc.nextInt();

            if (number < 2) {
                System.out.printf("%f is not a Prime", number);
            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.println(number + " is a prime");
                } else {
                    System.out.println(number + " is not a prime");
                }
            }
        } while (true);
    }
}
