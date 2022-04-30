package homeWork;

public class HW2 {

    public static void main(String[] args) {

        int k = 5;
        int l = 10;
        int m = 15;

        // Вывод переменных в столбик
        System.out.println( k );
        System.out.println( l );
        System.out.println( m );

        // Вывод переменных в строку
        System.out.print( k );
        System.out.print( l );
        System.out.println( m );

        // Вывод переменных в сроку (конкатенация)
        System.out.println( k + "," + l + "," + m + ",");

        // Вывод названия переменных с значением
        System.out.println( "k = " + k);
        System.out.println( "l = " + l);
        System.out.println( "m = " + m);

        // Вывод результата вычислений
        // Вариант №1
        System.out.println( "Sum of k and l = " + (k + l));
        System.out.println( "k * m = " + (k * m));
        System.out.println( "Разность переменных l и m = " + (l - m));
        // Вариант №2
        int first = k + l;
        int second = k * m;
        int treeth = l - m;
        System.out.println( "Sum of k and l = " + first);
        System.out.println( "k * m = " + second);
        System.out.println( "Разность переменных l и m = " + treeth);

        System.out.println( "Результат деления" +
                " k на l = " + (k / l) + ", а остаток от деления  =" + (k % l));
        System.out.println( "Результат деления" +
                " k на l = " + (k / m) + ", а остаток от деления  =" + (k % m));
        System.out.println( "Результат деления" +
                " k на l = " + (m / k) + ", а остаток от деления  =" + (m % k));

        // Студенты и яблоки
        int apple = 40;
        int student = 6;
        int apple1 = apple / student;
        int student1 = apple % student;

        System.out.println("Если " + apple + " яблок поделить на " + student
                + " учеников, то каждый" + " ученик получит по " + apple1
                + " яблок, и " + student1 + " яблока останется учителю.");

        // Сумма и разность
        int plus_1 = m;
        int minus_1 = m;
        plus_1++;
        minus_1--;
        int _1 = (k + l + plus_1);
        int _2 = (k + l + minus_1);
        System.out.println(plus_1);
        System.out.println(minus_1);
        //int minus_1 = m--;
        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = "
                + (_1 + _2) + ", а разность m++ и  sumLKM = "
                + (plus_1 - (l + k + m)) + ".");

        /*Чет нечет*/
        int multiple = 48 % 8;
        int even1 = 48 % 2;
        int even2 = 8 % 2;

        int odd = 49 % 2;
        int odd1 = 47 % 2;

        System.out.println("48 кратно 8 потому что остаток от деления = "
                + multiple + " ,оба этих числа " + "четные потому что остаток "
                + "от деления 48 на 2 = " + even1 + " и 8 на 2 остаток тоже = "
                + even2 + ".");
        System.out.println("Числа 49 и 47 не четные, потому что остаток от "
                + "деления 49 на 2 = " + odd + " и 47 на 2 остаток = " + odd1
                + ".");

        // Таблица вычислений
        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        int result21 = (x + 3) * (x + 3);
        int result22 = (((3 + 4 * x) - 10 * (y + 3) * (a + b + c)) / (5 * x)) +
                (9 * ((4 / x) + ((9 + x) / y)));
        int up23 =  (5 * x + 7 * y) / (8 * x + 10 * y);
        int up23_1 = (3 * x - y) / (x + y);
        System.out.println(up23_1);
        int up23_2 = up23 / up23_1;
        int down23 = a + b + c / d + (a + b) / (c + d) + a * b;
        int result23 = up23_2 / down23;

        System.out.println("________________________");
        System.out.println("|" + " TASK 21" + " |    " + result21 + "      |");
        System.out.println("|_________|____________|");
        System.out.println("|" + " TASK 22" + " |   " + result22 + "     |");
        System.out.println("|_________|____________|");
        System.out.println("|" + " TASK 23" + " |    " + result23 + "       |");
        System.out.println("|_________|____________|");

    }

}
