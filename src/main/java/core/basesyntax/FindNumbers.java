package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] clearedDigits = text.replaceAll("[^0-9\\-]"," ").trim().split("\\s+");
        int[] parsedDigits = new int[clearedDigits.length];
        for (int i = 0; i < parsedDigits.length; i++) {
            parsedDigits[i] = Integer.valueOf(clearedDigits[i]) * 2;
        }
        return parsedDigits;
    }
}
