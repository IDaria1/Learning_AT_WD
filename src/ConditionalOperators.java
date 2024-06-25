public class ConditionalOperators {

    public static void main(String[] args) {
        // Test data
        String name1 = "Daria";
        String name2 = "Daria";
        int[] fiveNumbers = {194, 90, 45, 13, 195};
        int[] fourNumbers = {3, 8, 8, 9};
        int month = 12;

        // Calling methods with test data
        compareNames(name1, name2);
        minMaxNumbers(fiveNumbers);
        seasons(month);
        smallestNumber(fourNumbers);
        countMaxNumbers(fourNumbers);
    }
    public static void compareNames(String name1, String name2) {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Тезки");
        } else {
            System.out.println("Разные имена");
        }
    }
    public static void minMaxNumbers(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);
    }
    public static void seasons(int month) {
        String monthString;
        switch (month) {
            case 12:
            case 1:
            case 2:
                monthString = "зима";
                break;
            case 3:
            case 4:
            case 5:
                monthString = "весна";
                break;
            case 6:
            case 7:
            case 8:
                monthString = "лето";
                break;
            case 9:
            case 10:
            case 11:
                monthString = "осень";
                break;
            default:
                throw new IllegalArgumentException("Неверный номер месяца: " + month);
        }
        System.out.println(monthString);
    }
    public static void smallestNumber(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Наименьшее число: " + min);
    }
    public static void countMaxNumbers(int[] numbers) {
        int max = numbers[0];
        int count = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        for (int number : numbers) {
            if (number == max) {
                count++;
            }
        }
        System.out.println("Количество максимальных чисел среди этих четырех: " + count);
    }
}