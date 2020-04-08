import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scan.nextLine());
        double fruitPrice = Double.parseDouble(scan.nextLine());
        int vegetablesKilograms = Integer.parseInt(scan.nextLine());
        int fruitKilograms = Integer.parseInt(scan.nextLine());
        double totalPrice = (vegetablesPrice * vegetablesKilograms + fruitKilograms * fruitPrice) / 1.94;
        System.out.println(totalPrice);
    }
}
