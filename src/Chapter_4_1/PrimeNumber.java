package Chapter_4_1;

/*
Раздел 4.5

Задание 3:
Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */

public class PrimeNumber {
    public static void main (String[] args) {
        int number = (int) (Math.random() * 1000 + 1);
        boolean result = false;

//        if (number<2)
//            result = false;

        for (int i = 2; i<=number; i++) {
            if (number % i == 0 && i != number) {    //делится без остатка, но не на себя - Число составное
                result = false;
                break;
            }
            result = true;                           //иначе - Число простое
        }

        System.out.print(number);
        System.out.println(result ? " - Число простое" : " - Число составное");

    }
}
