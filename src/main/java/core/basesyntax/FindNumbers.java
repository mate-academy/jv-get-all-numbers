package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbersSplit = text.replaceAll("[^-0-9]+", " ").trim().split("\\s+");
        int[] numbersConverted = new int[numbersSplit.length];
        for (int i = 0; i < numbersSplit.length; i++) {
            numbersConverted[i] = Integer.parseInt(numbersSplit[i], 10) * 2;
        }
        return numbersConverted;
    }
}
