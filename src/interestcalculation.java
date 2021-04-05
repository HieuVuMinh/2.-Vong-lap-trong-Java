import java.util.Scanner;

public class interestcalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = 1;
        int month = 1;
        double interset = 1;

        System.out.println("Enter Money:");
        money = sc.nextDouble();
        System.out.println("Enter Month:");
        month = sc.nextInt();
        System.out.println("Enter interset:");
        interset = sc.nextDouble();

        double total_interset = 0;
        total_interset = money * (interset / 100) / 12 * month;
        System.out.println(total_interset);
    }
}
