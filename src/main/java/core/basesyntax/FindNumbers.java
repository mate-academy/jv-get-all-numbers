package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] stringArrayOfNumbers = text.replaceAll("[^\\d-]+", " ")
                .trim().split(" ");
        int[] resultNumberArray = new int[stringArrayOfNumbers.length];
        for (int i = 0; i < stringArrayOfNumbers.length; i++) {
            resultNumberArray[i] = Integer.parseInt(stringArrayOfNumbers[i]) * 2;
        }
        return resultNumberArray;
    }
}
