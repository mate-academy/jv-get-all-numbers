package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] resultString = text.replaceAll("[^0-9-]", " ").trim().split("\\s+");
        int[] resultArray = new int[resultString.length];
        for (int i = 0; i < resultString.length; i++) {
            if (resultString[i].length() > 0) {
                resultArray[i] = (Integer.parseInt(resultString[i]) * 2);
            }
        }
        return resultArray;
    }
}
