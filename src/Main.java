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
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minSum = 200_000;
        for (final int current : arr) {
            if (current < minSum) {
                minSum = current;
            }
        }
        int maxSum = -1;
        for (final int current : arr) {
            if (current > maxSum) {
                maxSum = current;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей%n", minSum, maxSum);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int month =30;
        for (int element : arr) {
            sum = sum + element;
        }
        float averageSum = sum / month;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

    }
    public static void task4() {
        System.out.println("Задача 4");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);;
        }
        System.out.println(" ");
    }
}