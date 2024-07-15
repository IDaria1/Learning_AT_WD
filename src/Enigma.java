import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        riddleGame("Что увеличивается, но никогда не уменьшается?");
    }

    public static void riddleGame(String riddle) {
        Scanner scan = new Scanner(System.in);
        System.out.println(riddle);
        System.out.println("У вас есть 3 попытки.");
        for (int attempt = 3; attempt > 0; attempt--) {
            String userAnswer = scan.nextLine();
            if (userAnswer.equalsIgnoreCase("Сдаюсь")) {
                System.out.println("Правильный ответ: Возраст");
                return;
            }
            if (userAnswer.equalsIgnoreCase("Возраст")) {
                System.out.println("Правильно");
                return;
            }
            if (attempt == 1) {
                System.out.println("Подумайте ещё");
                return;
            }
            System.out.println("Не угадали. Попробуйте ещё раз. Осталось попыток: " + (attempt - 1));
        }
    }
}
