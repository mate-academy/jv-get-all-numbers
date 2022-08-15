package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbers = text.replaceAll("[^-?0-9]+", " ").trim().split(" ");
        int[] myNumbers = new int[numbers.length];
        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] += Integer.parseInt(numbers[i]) * 2;
        }
        return myNumbers;
    }
}
