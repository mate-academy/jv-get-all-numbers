# jv-get-numbers-from-string
Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
целые числа и иные символы.

Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.

Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
числа 92, 18, 26 и 0.


Чеклист:
Don’t create unnecessary variables. 
Let’s use method replaceAll() with regular expression, and method split() in this task.
