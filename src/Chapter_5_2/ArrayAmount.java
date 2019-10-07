package Chapter_5_2;

/*
Раздел 5.3

Задание 6:
Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
(Сами максимальное и минимальное значения в суммировании не участвуют.)

Замечание, если минимальных или максимальных элементов несколько, можно выбирать любой из них.
 */

public class ArrayAmount {
    public static void main (String[] args) {
        int size = 10;
        int min, max, amount = 0, indexMin = 0, indexMax = 0, temp;
        String arrayPrint = "";
        int[] array = new int[size];

        for(int i = 0; i<array.length; i++) {         //заполняем массив
            array[i] = (int) (Math.random() * 100 + 1);
            arrayPrint += array[i] + " ";              //записываем значения в строку
        }

        System.out.println("Сгенерированнвый массив - " + arrayPrint);

        min = max = array[0];

        for (int i = 0; i<array.length; i++) {     //ищем максимаальные и минимальные элементы
            if(array[i]>max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i]<min) {
                min = array[i];
                indexMin = i;
            }
        }

        if (indexMin > indexMax) {      //если максимальный элемент находится левее минимального
            temp = array[indexMax];              //меняем местами значения
            array[indexMax] = array[indexMin];
            array[indexMin] = temp;

            temp = indexMax;                   //а так же номера индексов
            indexMax = indexMin;
            indexMin = temp;
        }

        for (int i = indexMin + 1; i < indexMax; i++)    //сумируем элементы между нйденых значений
            amount += array[i];

        System.out.println("Сумма элементов между минимальным и максимальным значением = " + amount);
    }

}
