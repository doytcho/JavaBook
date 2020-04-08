import java.util.Scanner;

public class DailyEarnings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        double daysMoney = Double.parseDouble(scan.nextLine());
        double dolarsLevs = Double.parseDouble(scan.nextLine());
        double totalMoney = days * daysMoney * 14.5 * 0.75;
        double totalMoneyInLevs = totalMoney * dolarsLevs;
        System.out.printf("%.2f",totalMoneyInLevs/365);
    }
}
