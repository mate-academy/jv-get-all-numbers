package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] stringArray = text.replaceAll("[^-?0-9]+", " ").trim().split(" ");
        int[] digitsArray = new int[stringArray.length];
        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] = Integer.parseInt(stringArray[i]) * 2;
        }
        return digitsArray;
    }
}
