import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        evenAndOddNumbers(9);
    }

    public static void evenAndOddNumbers(int max) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i <= max; i++) {
            if (i % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }

        Collections.sort(evens);
        Collections.sort(odds, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.max(evens.size(), odds.size()); i++) {
            if (i < odds.size()) {
                result.append(odds.get(i)).append(" ");
            }
            if (i < evens.size()) {
                result.append(evens.get(i)).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
