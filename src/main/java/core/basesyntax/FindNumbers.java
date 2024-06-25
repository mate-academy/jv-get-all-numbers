package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] linesSplited = text.replaceAll("[^\\d\\-]+",
                " ").trim().split(" ");
        int[] result = new int[linesSplited.length];
        for (int i = 0; i < linesSplited.length; i++) {
            result[i] = Integer.parseInt(linesSplited[i]) * 2;
        }
        return result;
    }
}
