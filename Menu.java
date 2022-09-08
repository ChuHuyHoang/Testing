import java.util.Scanner;

public class Menu {
    static String first = "";
    static String numberOfDemo = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            checkPattern(sc, args);
            System.out.println("***************************************************");
            System.out.println();
            System.out.print("Do you want continue?( press y to say yes or another to say no) : ");
            char answer = sc.nextLine().charAt(0);
            if (answer != 'y')
                break;
        }
    }

    public static void inputNumberOfDemo(Scanner sc) {

        System.out.print("Enter exericses you want to check: ");
        numberOfDemo = sc.nextLine();
        numberOfDemo = numberOfDemo.trim();
        numberOfDemo = numberOfDemo.replaceAll("\\s+", "");
        numberOfDemo = numberOfDemo.replaceAll(",", ".");
        System.out.println();
        System.out.println();
    }

    public static void checkPattern(Scanner sc, String[] args) {
        System.out.println("               TESTING HOMEWORK MENU               ");
        System.out.println("***************************************************");
        System.out.println();
        System.out.println("1  . Running Adapter pattern demo.");
        System.out.println("2  . Running Builder pattern demo.");
        System.out.println("3  . Running Decorator pattern demo.");
        System.out.println("4  . Running Factory pattern demo.");
        System.out.println("5  . Running Iterator pattern demo.");
        System.out.println("6  . Running Observer pattern demo.");
        System.out.println("7  . Running Singleton pattern demo.");
        System.out.println("8  . Running Strategy pattern demo.");
        System.out.println("stp. Ending this menu.");
        System.out.println();
        System.out.print("Enter your option: ");

        while (true) {
            first = sc.nextLine();
            first = first.trim();
            first = first.toLowerCase();
            first = first.replaceAll("\\s+", "");
            first = first.replaceAll(",", ".");
            if (first.equals("1") || first.equals("2") || first.equals("3") || first.equals("4")
                    || first.equals("5") || first.equals("6") || first.equals("7") || first.equals("8")) {
                getDemo(first, sc, args);
                break;
            } else if (first.equals("stp")) {
                System.exit(0);

            } else
                System.out.print("We don't have this option. Try it again: ");
        }

    }

    public static void getDemo(String name, Scanner sc, String[] args) {
        switch (name) {
            case "1":
                adapter.ducks.TestDrive.main(args);
                break;
            case "2":
                builder.pizza.PizzaTestMain.main(args);
                break;
            case "3":
                runDecoratorDemo(sc, args);
                break;
            case "4":
                runFactoryDemo(sc, args);
                break;
            case "5":
                iterator.dinermerger.MenuTestDrive.main(args);
                break;
            case "6":
                runObserverDemo(sc, args);
                break;
            case "7":
                runSingletonDemo(sc, args);
                break;
            case "8":
                strategy.MiniDuckSimulator.main(args);
                break;

        }
    }

    public static void runSingletonDemo(Scanner sc, String[] args) {
        System.out.println("");
        System.out.println("1 Chocolate Demo");
        System.out.println("2 Classic Demo");
        System.out.println("3 Subclass Demo");
        System.out.println("0 Back to previous");
        inputNumberOfDemo(sc);
        switch (numberOfDemo) {
            case "0":
                checkPattern(sc, args);
                break;
            case "1":
                singleton.chocolate.ChocolateController.main(args);
                break;
            case "2":
                singleton.classic.SingletonClient.main(args);
                break;
            case "3":
                singleton.subclass.SingletonTestDrive.main(args);
                break;
            default:
                System.out.println("That isn't a good choice, Try it again!!!! ");
                runSingletonDemo(sc, args);
        }

    }

    public static void runObserverDemo(Scanner sc, String[] args) {
        System.out.println("");
        System.out.println("1 Simple Demo");
        System.out.println("2 Weather Demo");
        System.out.println("0 Back to previous");
        inputNumberOfDemo(sc);
        switch (numberOfDemo) {
            case "0":
                checkPattern(sc, args);
                break;
            case "1":
                observer.simple.Example.main(args);
                break;
            case "2":
                observer.weather.WeatherStation.main(args);
                break;
            default:
                System.out.println("That isn't a good choice, Try it again!!!! ");
                runObserverDemo(sc, args);
        }
    }

    public static void runFactoryDemo(Scanner sc, String[] args) {
        System.out.println("");
        System.out.println("1 Pizzaaf Demo");
        System.out.println("2 Pizzaafm Demo");
        System.out.println("3 Pizzas Demo");
        System.out.println("0 Back to previous");
        inputNumberOfDemo(sc);
        switch (numberOfDemo) {
            case "0":
                checkPattern(sc, args);
                break;
            case "1":
                factory.pizzaaf.PizzaTestDrive.main(args);
                break;
            case "2":
                factory.pizzaaf.PizzaTestDrive.main(args);
                break;
            case "3":
                factory.pizzas.PizzaTestDrive.main(args);
                break;
            default:
                System.out.println("That isn't a good choice, Try it again!!!! ");
                runFactoryDemo(sc, args);
        }

    }

    public static void runDecoratorDemo(Scanner sc, String[] args) {
        System.out.println("");
        System.out.println("1 Pizza Demo");
        System.out.println("2 Starbuzz Demo");
        System.out.println("3 Stabuzz With Sizes Demo");
        System.out.println("0 Back to previous");
        inputNumberOfDemo(sc);
        switch (numberOfDemo) {
            case "0":
                checkPattern(sc, args);
                break;
            case "1":
                decorator.pizza.PizzaStore.main(args);
                break;
            case "2":
                decorator.starbuzz.StarbuzzCoffee.main(args);
                break;
            case "3":
                decorator.starbuzzWithSizes.StarbuzzCoffee.main(args);
                break;
            default:
                System.out.println("That isn't a good choice, Try it again!!!! ");
                runDecoratorDemo(sc, args);

        }
    }

}
