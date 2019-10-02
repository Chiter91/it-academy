package Chapter_3_1;

/*
Раздел 3.3

Задание 1:
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 */

public class Pifagor {
    public static void main (String[] args) {
        int a, b, r;
        a = (int) (Math.random()*10 + 1);
        b = (int) (Math.random()*10 + 1);
        r = (int) (Math.random()*10 + 1);

        System.out.println ("Размеры прямоугольного отверстия: " + a + " * " + b);
        System.out.println ("Радиус круглой картонки: " + r);

        double c = Math.pow (a, 2) + Math.pow(b, 2);
        c = (Math.sqrt(c));

        if (c > r)
            System.out.println ("\n"+"Этой картонкой НЕ закрыть отверстие");
        else
            System.out.println ("\n"+"Этой картонкой МОЖНО закрыть отверстие");

        System.out.println ("\n"+"Т.к. диагональ отверстия равна: " + c);


    }
}
