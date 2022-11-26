package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterSize = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkSize = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int cofeeBeansSize = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int noOfCups = scanner.nextInt();

        int water_per_cup = 200;
        int milk_per_cup = 50;
        int beans_per_cup = 15;

        int cupOfCofeeMade = 0;

        String outputMessage;

        while (water_per_cup <= waterSize && milk_per_cup <= milkSize && beans_per_cup <= cofeeBeansSize) {
            cupOfCofeeMade += 1;
            waterSize -= water_per_cup;
            milkSize -= milk_per_cup;
            cofeeBeansSize -= beans_per_cup;
        }

        if (cupOfCofeeMade >= noOfCups) {
            outputMessage = "Yes, I can make that amount of coffee";
            if (cupOfCofeeMade > noOfCups)
                outputMessage += " (and even " + (cupOfCofeeMade - noOfCups) + " more than that)";
                System.out.println(outputMessage);
        } else {
                System.out.println("No, I can make only " + cupOfCofeeMade + " cup(s) of coffee");
            }
    }
}