import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        compareSumOfNumbers();
        positiveOrNegativeNum();
        booleanPositiveOrNegative();
        stringAndInt();*/
        leapYear();
        /*massive();
        cycleHundred();
        massiveDoubleTwo();
        doubleMassive();
        lastEx(); */
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 6;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 5;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 11;
        int b = 1;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void compareSumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        boolean result = false;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println(sum);
        } else {
            System.out.println(result);
        }
    }

    public static void positiveOrNegativeNum () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void booleanPositiveOrNegative() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = sc.nextInt();

        boolean number;

        if (num >= 0) {
            number = true;
            System.out.println(num + " положительное число");
        } else {
            number = false;
            System.out.println(num + " отрицательное число");
        }
    }


    public static void stringAndInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = sc.nextLine();
        System.out.println("Введите число: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++)
            System.out.println(string);
    }

    public static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();

        boolean isLeapYear = true;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(isLeapYear);
        } else {
            isLeapYear = false;
            System.out.println(isLeapYear);
        }
    }

    public static void massive() {
        int[] a = {0, 1, 0, 1};
        for(int i = 0; i < a.length; i++)
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }

        System.out.println(Arrays.toString(a));
    }

    public static void cycleHundred() {
        int[] a = new int[100];

        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void massiveDoubleTwo() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        for (int i = 0; i < a.length; i++) {
            if(a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }

        System.out.println(Arrays.toString(a));
    }

    public static void doubleMassive() {
        int[][] a = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            a[i][a.length - i - 1] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][i] = 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void lastEx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину масива: ");
        int len = sc.nextInt();
        System.out.println("Введите значение: ");
        int initialValue = sc.nextInt();

        int[] a = new int[len];
        for(int i = 0; i < a.length; i++) {
            a[i] = initialValue;
        }

        System.out.println(Arrays.toString(a));
    }
}