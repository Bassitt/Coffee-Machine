package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int noOfCups = scanner.nextInt();

        final int waterSize = noOfCups * 200;
        final int milkSize = noOfCups * 50;
        final int cofeeBeansSize = noOfCups * 15;
        System.out.println("For " + noOfCups + " cups of coffee you will need:");

        System.out.println(waterSize + " ml of water");
        System.out.println(milkSize + " ml of milk");
        System.out.println(cofeeBeansSize + " g of coffee beans");
    }
}
