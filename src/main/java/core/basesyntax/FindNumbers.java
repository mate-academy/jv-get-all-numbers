package core.basesyntax;

import java.util.ArrayList;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 92, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^0-9 + -]+", " ").trim();
            if (words[i].isEmpty()) {
                continue;
            }
            String[] intermediateDigits = words[i].split(" ");
            for (int j = 0; j < intermediateDigits.length; j++) {
                arrayList.add(Integer.parseInt(intermediateDigits[j]) * 2);
            }
        }
        int[] arrayWithNumbers = new int[arrayList.size()];
        for (int i = 0; i < arrayWithNumbers.length; i++) {
            arrayWithNumbers[i] = arrayList.get(i);
        }
        return arrayWithNumbers;
    }
}
