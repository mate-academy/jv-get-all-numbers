package core.basesyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        ArrayList<String> removeEmptyBox = new ArrayList<>();
        Collections.addAll(removeEmptyBox, text.replaceAll("[^-\\d]", " ").split(" "));
        removeEmptyBox.removeAll(Collections.singletonList(""));
        int[] result = new int[removeEmptyBox.size()];
        int index = 0;
        for (String value : removeEmptyBox) {
            result[index] = Integer.parseInt(value) * 2;
            index++;
        }
        return result;
    }
}
