package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static int waterSize = 400;
    public static int milkSize = 540;
    public static int cofeeBeansSize = 120;
    public static int disposableCups = 9;
    public static int money = 550;

    public static Scanner scanner = new Scanner(System.in);

    public static void stat() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(waterSize + " ml of water");
        System.out.println(milkSize + " ml of milk");
        System.out.println(cofeeBeansSize + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void check(int water_per_cup, int milk_per_cup, int beans_per_cup, int cost_per_cup) {
        if (waterSize < water_per_cup) {
            System.out.println("Sorry, not enough water!");
        } else if (milkSize < milk_per_cup) {
            System.out.println("Sorry, not enough milk!");
        } else if (cofeeBeansSize < cost_per_cup) {
            System.out.println("Sorry, not enough beans!");
        } else {
            update(water_per_cup, milk_per_cup, beans_per_cup, cost_per_cup);
        }
    }

    public static void update(int water_per_cup, int milk_per_cup, int beans_per_cup, int cost_per_cup) {
        System.out.println("I have enough resources, making you a coffee!");
        waterSize -= water_per_cup;
        milkSize -= milk_per_cup;
        cofeeBeansSize -= beans_per_cup;
        money += cost_per_cup;
        disposableCups -= 1;
    }

    public static void espresso(){
        int water_per_cup = 250;
        int milk_per_cup = 0;
        int beans_per_cup = 16;
        int cost_per_cup = 4;
        check(water_per_cup, milk_per_cup, beans_per_cup, cost_per_cup);
    }

    public static void latte() {
        int water_per_cup = 350;
        int milk_per_cup = 75;
        int beans_per_cup = 20;
        int cost_per_cup = 7;
        check(water_per_cup, milk_per_cup, beans_per_cup, cost_per_cup);
    }

    public static void cappuccino() {
        int water_per_cup = 200;
        int milk_per_cup = 100;
        int beans_per_cup = 12;
        int cost_per_cup = 6;
        check(water_per_cup, milk_per_cup, beans_per_cup, cost_per_cup);
    }

    public static void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String input = scanner.next();
        switch (input) {
            case "1" -> espresso();
            case "2" -> latte();
            case "3" -> cappuccino();
        }
    }

    public static void fill() {
        System.out.println();
        System.out.println("Write how many ml of water you want to add: ");
        int fillWater = scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add: ");
        int fillMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add: ");
        int fillCofeeBeans = scanner.nextInt();

        System.out.println("Write how many disposable cups you want to add: ");
        int fillDisposableCups = scanner.nextInt();

        waterSize += fillWater;
        milkSize += fillMilk;
        cofeeBeansSize += fillCofeeBeans;
        disposableCups += fillDisposableCups;
    }

    public static void take() {
        System.out.println("I gave you " + "$" + money);
        money = 0;
    }

    public static void main(String[] args) {
        label:
        while (true) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String input = scanner.next();
            switch (input) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    stat();
                    break;
                default:
                    break label;
            }
        }
    }
}