package Chapter_6_1;

/*
Раздел 6.3

Задание 7:
Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */

public class FindMarks {
    public static void main (String[] args) {
        int count = 0;
        String s = "Тестовая, строка, в которой,,... несколько! знаков препинания:?";
        String marks = ".,!?-:;()\"";
//        String ellipsis = "...";
//        int temp;

//        temp = s.indexOf(ellipsis);

        for (int i = 0; i<s.length(); i++) {
//            if (i == temp) {
//                i += 2;
//                count++;
//            }
            for (int j = 0; j<marks.length(); j++) {
                if (s.charAt(i) == marks.charAt(j))
                    count++;
            }
        }
        System.out.println("В стрроке  \"" + s + "\" мы насчитали " + count + " знаков препинания");
    }
}
