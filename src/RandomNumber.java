import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    private int minRange;
    private int maxRange;
    private int attempts;
    private Scanner scan;
    private Random random;

    public static void main(String[] args) {
        new RandomNumber(0, 100, 5);
    }

    public RandomNumber(int minRange, int maxRange, int attempts) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.attempts = attempts;
        scan = new Scanner(System.in);
        random = new Random();
        int randomNumber = random.nextInt((maxRange - minRange) + 1);
        System.out.println(randomNumber);
        System.out.println("Я загадал число от 1 до 100.");
        System.out.println("У тебя есть 5 попыток.");
        int attempt = 6;
        int difference = 0;
        while (attempt >= 1) {
            attempt--;
            int userNumber = scan.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Ты угадал, счастливчик!");
                return;
            }
            if (attempt >= 5) {
                difference = Math.abs(randomNumber - userNumber);
                System.out.println(String.format("Не угадал! Осталось %s попытки! Попробуй ещё раз!",
                    --attempt
                ));
            } else if (attempt == 0) {
                System.out.println("Ты истратил все свои попытки, запусти программу еще раз!");
                return;
            } else {
                int temp = Math.abs(randomNumber - userNumber);
                String hint = difference == temp
                    ? "Слушай, а разница-то равна на этот раз!"
                    : (difference > temp ? "Теплее" : "Холоднее");
                difference = temp;
                System.out.println(String.format("%s! Снова не угадал! Осталось %s попытки! Попробуй ещё раз!",
                    hint,
                    attempt
                ));
            }
        }
    }
}
