import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        double workingDays = days * 0.9;
        double workingHours = workingDays * 8 * workers;
        double overtimeHours = 2 * workers * workingDays;
        double totalHours = Math.floor(workingHours + overtimeHours);
        if (totalHours >= hours) {
            System.out.printf("Yes!%.0f hours left.", totalHours - hours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hours - totalHours);
        }
    }
}
