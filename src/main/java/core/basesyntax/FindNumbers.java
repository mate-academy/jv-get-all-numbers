package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbersString = text.replaceAll("[^-?\\d]+", " ")
                .trim().split(" ");
        int[] result = new int[numbersString.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(numbersString[i]) * 2;
        }
        return result;
    }
}
