package core.basesyntax;

import java.util.Arrays;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        return Arrays.stream(text
                .replaceAll("[^-\\d]", " ")
                .split("\\s+"))
                .filter(number -> !number.isEmpty())
                .mapToInt(Integer::parseInt)
                .map(number -> number * 2)
                .toArray();
    }
}
