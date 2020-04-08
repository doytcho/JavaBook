import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int area = Integer.parseInt(scan.nextLine());
        double grapePerSquareMeters = Double.parseDouble(scan.nextLine());
        int wineNeed = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        double grepeForWine = area * grapePerSquareMeters * 0.4;
        double wineLiters = grepeForWine / 2.5;
        if (wineLiters >= wineNeed) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineLiters));

            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLiters - wineNeed), Math.ceil((wineLiters - wineNeed) / workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeed - wineLiters));
        }
    }
}
