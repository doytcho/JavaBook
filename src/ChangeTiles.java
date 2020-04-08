import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double w = Double.parseDouble(scan.nextLine());
        double l = Double.parseDouble(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int o = Integer.parseInt(scan.nextLine());
        double area = n * n - m * o;
        double plocki = area / w / l ;
        System.out.println(plocki);
        System.out.println(plocki*0.2);
    }
}
