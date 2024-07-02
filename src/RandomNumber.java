import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        randomNumberGame(0, 100, 5);
    }

    public static void randomNumberGame(int minRange, int maxRange, int attempts) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt((maxRange - minRange) + 1) + minRange;
        System.out.println(randomNumber);
        System.out.println("Я загадал число от " + minRange + " до " + maxRange + ".");
        System.out.println("У тебя есть " + attempts + " попыток.");
        int difference = 0;

        for (int attempt = attempts; attempt > 0; attempt--) {
            int userNumber = scan.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Ты угадал, счастливчик!");
                return;
            }
            if (attempt == attempts) {
                difference = Math.abs(randomNumber - userNumber);
                System.out.println(String.format("Не угадал! Осталось %d попытки! Попробуй ещё раз!", attempt - 1));
            } else if (attempt == 1) {
                System.out.println("Ты истратил все свои попытки, запусти программу еще раз!");
                return;
            } else {
                int temp = Math.abs(randomNumber - userNumber);
                String hint = difference == temp ? "Слушай, а разница-то равна на этот раз!" : (difference > temp ? "Теплее" : "Холоднее");
                difference = temp;
                System.out.println(String.format("%s! Снова не угадал! Осталось %d попытки! Попробуй ещё раз!", hint, attempt - 1));
            }
        }
    }
}