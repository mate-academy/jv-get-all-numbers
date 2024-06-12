package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {

        String textCleaned = text.replaceAll("[^-0-9]+", " ");
        String[] textSplited = textCleaned.trim().split(" ");
        int[] multiInt = new int[textSplited.length];

        for (int i = 0; i < textSplited.length; i++) {
            Integer number = Integer.parseInt(textSplited[i]);
            multiInt[i] = (number * 2);
        }
        return multiInt;
    }
}
