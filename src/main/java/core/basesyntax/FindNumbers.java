package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] textWithoutLetters = text.replaceAll("[^0-9\\-]"," ").trim()
                .split("\\s+");
        int[] answerArray = new int[textWithoutLetters.length];
        for (int i = 0; i < textWithoutLetters.length; i++) {
            answerArray[i] = Integer.parseInt(textWithoutLetters[i]) * 2;
        }
        return answerArray;
    }
}
