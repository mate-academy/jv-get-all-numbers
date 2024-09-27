package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] splitString = text.replaceAll("[^-?0-9]+", " ").trim().split(" ");
        int[] arrayOfDigits = new int[splitString.length];
        for (int i = 0; i < arrayOfDigits.length; i++) {
            arrayOfDigits[i] = Integer.parseInt(splitString[i]) * 2;
        }
        return arrayOfDigits;
    }
}
