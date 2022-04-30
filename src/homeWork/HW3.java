package homeWork;

import static java.lang.Double.sum;
import static java.lang.Float.sum;
import static java.lang.Short.*;

public class HW3 {

    public static void main(String[] args) {
        // TASK 1
        String task = "TASK № ";
        String starStart = " ***** ";
        String starEnd = " *****";
        String line1 = " --------------------";
        String line2 = " ---------------------";
        int numberTask = 2;

        //String print = starStart + task + numberTask + starEnd;
        //numberTask = numberTask + 1;
        // TASK 2
        System.out.println(line1);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line1);

        byte a = 25;
        byte b = 65;

        System.out.println(a + " , " + b);
        // TASK 3
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line1);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line1);

        short s = -30000;
        short t = 29999;

        System.out.println(s + " , " + t);
        // TASK 4
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line1);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line1);

        Integer i;
        String lineTableUp = "_____________________________________";
        String lineTableDown = "|___________|_______________________|";
        String lineV1 = "|";
        String lineV2 = "\t|";
        String lineV3 = "\t\t\t|";

        System.out.println(lineTableUp);
        System.out.println(lineV1 + " int min " + lineV2 + "\t" + Integer.MIN_VALUE + lineV3);
        System.out.println(lineTableDown);
        System.out.println(lineV1 + " int max " + lineV2 + "\t " + Integer.MAX_VALUE + lineV3);
        System.out.println(lineTableDown);
        // TASK 5
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line1);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line1);

        long phoneNumber = 23456789012L;

        System.out.println("Phone: " + phoneNumber);
        // TASK 6
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line1);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line1);

        float f = 100.101101F;
        double d = 100.101101;

        System.out.println(lineTableUp);
        System.out.println(lineV1 + " float " + lineV2 + "\t" + f + lineV3);
        System.out.println(lineTableDown);
        System.out.println(lineV1 + " double" + lineV2 + "\t" + d + lineV3);
        System.out.println(lineTableDown);
        // TASK 7
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line1);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line1);

        float ff = 10.09999F + 20.099999F;
        double dd = 10.09999F + 20.099999F;

        System.out.println(lineTableUp);
        System.out.println(lineV1 + " float " + lineV2 + "\t" + f + lineV3);
        System.out.println(lineTableDown);
        System.out.println(lineV1 + " double" + lineV2 + "\t" + d + lineV3);
        System.out.println(lineTableDown);
        System.out.println(lineV1 + " floatSum " + lineV2 + "\t" + ff + lineV3);
        System.out.println(lineTableDown);
        System.out.println(lineV1 + " doubleSum" + lineV2 + "\t" + dd + lineV2);
        System.out.println(lineTableDown);
        // TASK 8
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line1);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line1);

        double result = 10 / 3;

        System.out.println(result);
        // TASK 9
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line1);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line1);

        double sum = f + d;
        double product = f - d;
        double quotient  = f * d;
        double remainder  = f % d;

        System.out.println(sum + " , " + product + " , " + quotient + " , " + remainder);
        // TASK 10
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        String H = "..  ..  ......  ..      ..        ...\n" +
                "..  ..  ..      ..      ..      ..   ..\n" +
                "......  .....   ..      ..      ..   ..\n" +
                "..  ..  ..      ..      ..      ..   ..\n" +
                "..  ..  ......  ......  ......    ...";

        System.out.println(H);
        // TASK 11
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = - 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;

        System.out.println(t1 + "\n" + t2 + "\n" + t3 + "\n" + t4 + "\n"
                + t5 + "\n" + t6 + "\n" + t7 + "\n" + t8 + "\n" + t9);

        // TASK 12
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);



        // TASK 13
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        Integer num1 = 20000;
        Integer num2 = 20000;

        System.out.println("Если num1 = num2, то результат " +
                "сравнения методом .equal = " + num1.equals(num2) + ".");

        // TASK 14
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        int number1 = 44;
        int number2 = 44;

        System.out.println("Если number1 = number2, то результат "
                + "сравнения методом .compare = "
                + Integer.compare(number1, number2) + ".");

        number1 = 40;
        number2 = 44;

        System.out.println("Если number1 < number2, то результат "
                + "сравнения методом .compare = "
                + Integer.compare(number1, number2) + ".");

        number1 = 44;
        number2 = 40;

        System.out.println("Если number1 > number2, то результат "
                + "сравнения методом .compare = "
                + Integer.compare(number1, number2) + ".");

        // TASK 15
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        Float different = 234.9999F;

        System.out.println(different.intValue());

        // TASK 16
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        double different1 = 234.9999;
        double different2 = 234.9999;

        System.out.println(sum(different1, different2));

        // TASK 17
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        Float different3 = 234.9999F;
        Float different4 = 234.9999F;

        System.out.println(sum(different3, different4));

        // TASK 18
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println("12000 - 12300 = " + (compare(short1, short2)));

        Short short3 = 12500;
        Short short4 = 12300;

        System.out.println("12000 - 12300 = " + (compare(short3, short4)));

        // TASK 19
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(doub1 - doub2);
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));

        // TASK 20
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);


        Double catTemperature = 40.55;
        Double midlleTemperature = catTemperature / 2;
        catTemperature = 35.55;
        midlleTemperature = catTemperature / 2 + midlleTemperature;


        System.out.println(Math.round(midlleTemperature));

        // TASK 21
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);

        Number n = MAX_VALUE;
        System.out.println(n);

        n = 10;
        System.out.println(n);

        n = 10.999999999;
        System.out.println(n);
        System.out.println("Это возможно, потому что Абстрактный класс Number\n"
                + "является суперклассом классов платформы, представляющих\n"
                + "числовые значения, которые могут быть преобразованы в\n"
                + "примитивные типы byte, double, float, int, long и short.");

        // TASK 22
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);


        // TASK 23
        numberTask = numberTask + 1;
        System.out.println("");
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);
    }
}
