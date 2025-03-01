package other_class;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private final List<Integer> evenNumbers = new ArrayList<>();
    private final List<Integer> oddNumbers = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void odd() {
        for (int number : oddNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}