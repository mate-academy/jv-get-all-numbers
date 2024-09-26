package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] textArray = text.replaceAll("[^\\d-]+", " ").trim().split("\\s");
        int[] digits = new int[textArray.length];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(textArray[i]) * 2;
        }
        return digits;
    }
}
