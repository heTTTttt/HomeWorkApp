public class Methods {
    public String printThreeWords() { // метод пише в рядок слова
        return """
                Orange
                Banana
                Apple""";
    }

    public void checkSumSign() { // метод пише суму двох змінних і виявляє його відношення від нуля
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (a + b >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public void printColor() { // метод визначає число і його відношенню до діапазону циклу
        int value = (int) (Math.random() * (201) - 200);
        System.out.println("value" + value);
        if (value <= 0) {
            System.out.println("Red");
        } else if (0 < value && value <= 100) {
            System.out.println("Yellow");
        } else
            System.out.println("Green");
    }

    public void compareNumber() { // метод визначає відносини змінних одне до одного
        int a = (int) (Math.random() * (201) - 100);
        int b = (int) (Math.random() * (201) - 100);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public boolean twoNumbers() { // метод визначає число та його відношення до діапазону від 10 до 20
        int a = (int) (Math.random() * 21) + 10;
        System.out.println("a = " + a);
        /*if (10 <= a && a <= 20){
            return true;
        }else
            return false;

         */
        return 10 <= a && a <= 20;
    }

    public void positiveOrNegativeNum(int num) { // метод визначає число (від'ємне чи додатне)
        System.out.println(num);
        if (num < 0) {
            System.out.println("Число від'ємне");
        } else System.out.println("Число додатне");
    }

    public boolean negativeOrPositiveNum(int num) { // метод визначає число (від'ємне чи додатне)
        System.out.println(num);
        /*if (num < 0){
            return true;
        }else return false;

         */
        return num < 0;
    }

    public void stringNum(String name, int num) { // метод пише вказаний рядок вказану кількість разів
        for (int i = 0; i < num; i++) {
            System.out.println(name);
        }
    }

    public boolean leapYear(int daysInYear) {
        /*if (daysInYear == 366){
            return true;
        }else return false;

         */
        return daysInYear == 366; // =)
    }

    public boolean leapYear2(int year) { // метод визначає високосний рік
        if (year % 4 ==0){
            if (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)){
                System.out.println("Високосний рік");
            }return true;
        }else System.out.println("Звичайний рік");
        return false;
    }
}