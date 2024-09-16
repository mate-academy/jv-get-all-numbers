package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numbers = text.replaceAll("[^-\\d]", " ").trim().split("\\s+");
        int[] result = new int[numbers.length];
        int index = 0;
        for (String value : numbers) {
            result[index] = Integer.parseInt(value) * 2;
            index++;
        }
        return result;
    }
}
