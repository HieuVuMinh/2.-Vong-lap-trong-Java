import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int choice;
            System.out.println("1. Draw a triangle");
            System.out.println("2. Draw a square");
            System.out.println("3. Draw a isosceles triangle");
            System.out.println("Chose Ur option:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("\n");
                        for (int j = 9; j > i; j--) {
                            System.out.println("*");
                        }
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.println("*");
                        }
                        System.out.println("\n");
                    }
                    break;
            }
        } while (true);
    }
}
