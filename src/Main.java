import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int maxArr = -1;
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current > maxArr) {
                maxArr = current;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        double average = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = sum / arr.length;
        }
        System.out.printf("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}
