public class Main {
    public static void main(String[] args) {
        Methods method = new Methods();

        System.out.println(method.printThreeWords()); // завдання 1

        System.out.println("----------------------");

        method.checkSumSign(); // завдання 2

        System.out.println("----------------------");

        method.printColor(); // завдання 3

        System.out.println("----------------------");

        method.compareNumber(); // завдання 4

        System.out.println("----------------------");

        System.out.println(method.twoNumbers()); // завдання 5

        System.out.println("----------------------");

        method.positiveOrNegativeNum((int) (Math.random() * (200 + 1)) - 100); // завдання 6
        System.out.println();
        method.positiveOrNegativeNum(0);

        System.out.println("----------------------");

        System.out.println(method.negativeOrPositiveNum((int) (Math.random() * (200 + 1)) - 100)); // завдання 7
        System.out.println(method.negativeOrPositiveNum(2));

        System.out.println("----------------------");

        method.stringNum("Illya", 2); // завдання 8

        System.out.println("----------------------");

        System.out.println(method.leapYear2(2019)); // завдання 9
    }
}
