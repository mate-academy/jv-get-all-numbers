package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {

        String[] result = text.replaceAll("[^\\d-]+"," ").trim().split(" ");
        int[] numbers = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            numbers[i] = Integer.parseInt(result[i]) * 2;
        }
        return numbers;
    }
}
