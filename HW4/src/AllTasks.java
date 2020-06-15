import java.util.Scanner;

public class AllTasks {
    //Задание 1
    //Написать функцию которая выводит в консоли от 1 до числа Х
    public static void printNumber() {
        System.out.print("Input X: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }

    //Задание 2
    // Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов
    static public void drawRectangle(int width, int height) {
        System.out.println("Your rectangle is: ");
        for (int i = 0; i < height; i++) {
            for (int a = 0; a < width; a++) {
                System.out.print('+' + " ");
            }
            System.out.println("\n");
        }

    }

    //Задание 3
    //Перегрузить функцию drawRectangle (задание 2) таким образом, чтобы она могла
    //принимать на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными
    //сторонами
    static public void drawRectangle(int side) {
        for (int i = 0; i < side; i++) {
            for (int a = 0; a < side; a++) {
                System.out.print('+' + " ");
            }
            System.out.println("\n");
        }
    }

    //Задание 4
    //Написать функцию getMax которая принимает на вход два аргумента в виде чисел. А
    //возвращает максимальное из этих двух.
    //Также, необходимо перегрузить эту функцию для работы с разными числовыми типами
    //переменных (int, float)
    public static void maxNumber(int i, int j) {
        int num1 = i;
        int num2 = j;
        System.out.print("Max value is: " + (num1 > num2 ? num1 : num2));
    }

    public static void maxNumber(int i, float j) {
        int num1 = i;
        float num2 = j;
        System.out.print("Max value is: " + ((float) num1 > num2 ? num1 : num2));
    }

    public static void maxNumber(float i, int j) {
        float num1 = i;
        int num2 = j;
        System.out.print("Max value is: " + (num1 > (float) num2 ? num1 : num2));
    }

    public static void maxNumber(float i, float j) {
        float num1 = i;
        float num2 = j;
        System.out.print("Max value is: " + (num1 > num2 ? num1 : num2));
    }

    //Задание 5
    //Решить задачу 1, без использования циклов. Используя рекурсию.
    private static int i = 1;

    public static void printNumberRecursion(int num) {
        System.out.println(i);
        i++;
        if (i <= num) {
            printNumberRecursion(num);
        }
    }

    //Задание 6
    //Решить задачу 2, без использования циклов. Используя рекурсию
    static String newString(int w) {
        if (w == 1) {
            return "+";
        } else {
            return newString(w - 1) + "+";
        }
    }


    static String rectangleWithRecursion(int width, int height) {
        if (height == 1) {
            return newString(width);
        } else {
            return newString(width) + "\n" + rectangleWithRecursion(width, height - 1);
        }
    }
}



