package Chapter_4_2;

/*
Раздел 4.5

Задание 4:
Имеется целое число. Следует посчитать сумму цифр данного числа.
 */

public class AmountNumeral {
    public static void main (String[] args) {

        for (int i = 1; i<=10; i++) {

            int x = (int) (Math.random() * 1000) + 1;
            int amount = 0;  //переменная для суммы цифр
            int number = x;  //переменная для хранения генерируемого числа

            while (x/10 >= 1) {  //повторяем пока число не станет одноразрядным
            amount += x%10;      //прибавляем последнюю цифру от числа к сумме
            x /= 10;             //откидываем один разряд от числа
            }
            amount += x;
            System.out.println("Сумма цифр числа - " + number + " равна:  " + amount);
        }

    }
}
