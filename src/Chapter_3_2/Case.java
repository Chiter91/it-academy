package Chapter_3_2;

/*
Раздел 3.3

Задание 2:
Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */

public class Case {
    public static void main (String[] args) {
        int x = (int) (Math.random() * 10000 + 1);
        String s;

        int r = (int) x % 100 / 10; // Узгнаем предпоследнюю цифру

        if (r == 1)
            s = " рублей";
        else {
            switch (x % 10) {        // Если предпоследняя цифра != 1, то смотрим последнюю цифру
                case 1:
                    s = " рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    s = " рубля";
                    break;
                default:
                    s = " рублей";
            }
        }
        System.out.println(x + s);
    }
}
