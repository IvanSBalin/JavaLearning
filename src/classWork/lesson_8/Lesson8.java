package classWork.lesson_8;

import static utils.Utilities.*;


public class Lesson8 {

    public static void main(String[] args) {


        int[] arr = new int[] {1, 2, 3};
        int[] arr1 = {1, 2, 3};

        int[] arr2 = new int[3];
        int[] arr3 = {0, 0, 0};

        int[] arr4 = new  int[1];
        int[] arr5 = {}; // Пустой массив размер 1 (без значений)

        int a = 4;
        double b = 5.5;

        Integer intReg =4;
        Integer intReg1 =4;
        Double doubReg = 5.5;

        Integer intObject = new Integer(4);
        Double doubObject = new Double(5.5);

        String str1 = "Hello";
        String str2 = "Hello";

        String strObject = new String("Hello");

        String cat1 = "Cat";// будут равны через == (сравнивается ссылка)
        String cat2 = "Cat";// будут равны через == (сравнивается ссылка)
        String cat3 = new String("Cat"); // не будут равны (разные ссылки, разные области памяти)
        String cat4 = new String("Cat"); // не будут равны (разные ссылки, разные области памяти)

        System.out.println(cat1.equals(cat3)); // всессылки сравниваются по значению через equels
        System.out.println(intReg.equals(intObject));
        System.out.println("__________________");
        System.out.println(cat1 == Lesson8_1.cat1_1); // сравнение из разных классов
        System.out.println("__________________");
        System.out.println(cat3 == cat4); // false
        System.out.println(str1 == str2); // true
        System.out.println(str1 == strObject); // false

        System.out.println("__________________");
        System.out.println(intReg == intReg1 ); // true
        System.out.println(intReg == intObject); // false

        System.out.println("__________________");
        System.out.println(Lesson8_1.dog1_1);
        line();
        ln();
        line();



    }
}
