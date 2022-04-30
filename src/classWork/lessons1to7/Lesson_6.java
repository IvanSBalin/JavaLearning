package classWork.lessons1to7;

public class Lesson_6 {

    public static void sequence(int l) {
        int end = 0;

        for(int i = 0; end < l; i += 2) {
            System.out.println(i);
            end ++;
        }
    }

    public static void main(String[] args) {



//        for() {
//
//    }
// Печатаем "Java for beginners!" 5 раз
        for(int i = 1; i < 6; i++) {
            System.out.println("Java for beginners!");
        }
        System.out.println();
// Печатаем числа от одного до 5 включительно
        for(int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println();
// Печатаем нечетные числа
        for(int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
            System.out.println(i + " - Odd.");
            } else {
                System.out.println(i + " - Even.");
            }
        }
        System.out.println();
// Печатаем числа с шагом 10.
        for(int i = 1; i < 101; i +=10) {
            System.out.println(i);
        }
        System.out.println();
// Печатаем числа кратное 10.
        for(int i = 1; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
// Печатаем числа кратное 10 от -100 до 100.
        for(int i = -100; i < 101; i += 10) {
            System.out.println(i);
        }
        System.out.println();
// Печатаем песню.
        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        String take = "Take one down and pass it around, ";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more ";
        String noMoreL = "no more";
        String ln = "\n";

        for(int i = 99; i > -1; i--) {
            if (i > 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + (i - 1) + bottles + wall + dot + ln);
            } else if (i == 2){
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + (i - 1) + bottle + wall + dot + ln);
            } else if (i == 1) {
                System.out.println(i + bottles + wall + commaSpace + i + bottle + dot);
                System.out.println(take + noMoreL + bottles + wall + dot + ln);
            } else {
                System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
                System.out.println(go + commaSpace + 99 + bottles + wall + dot);
            }
        }
        System.out.println();

        sequence(5);

    }



}
