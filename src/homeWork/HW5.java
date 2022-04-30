package homeWork;

import static utils.Utilities.*;

public class HW5 {

    public static int numberTask = 0;

    public static void taskNumber() {

        //counter();
        String task = "TASK № ";
        String starStart = " ***** ";
        String starEnd = " *****";
        String line1 = " --------------------";
        String line2 = " ---------------------";
        numberTask++;

        System.out.println();
        System.out.println(line2);
        System.out.println(starStart + task + numberTask + starEnd);
        System.out.println(line2);
        System.out.println();

    }

// TASK 1
    public static String dayOfWeek (int numberDay) {

        String nameDay;

        if (numberDay == 1) {
            nameDay = "Monday";
        } else if (numberDay == 2) {
            nameDay = "Tuesday";
        } else if (numberDay == 3) {
            nameDay = "Wednesday";
        } else if (numberDay == 4) {
            nameDay = "Thursday";
        } else if (numberDay == 5) {
            nameDay = "Friday";
        } else if (numberDay == 6) {
            nameDay = "Saturday";
        } else if (numberDay == 7) {
            nameDay = "Sunday";
        } else {
            nameDay = "Please, input correct number.\n"
            + "Number must be from 1 to 7.";
        }

        return nameDay;
    }
// TASK 2
        public static String largestNumber (int x, int y, int z) {

        int largest;

        if (x > y && x > z) {
            largest = x;
        } else if (y > x && y > z) {
            largest = y;
        } else {
            largest = z;
        }

        return "Наибольшее число из трех = " + largest;
    }
// TASK 3
    public static String smallestNumber (int x, int y, int z) {

        int smallest;

        if (x < y && x < z) {
            smallest = x;
        } else if (y < x && y < z) {
            smallest = y;
        } else {
            smallest = z;
        }

        return "Наименьшее число из трех = " + smallest;
    }
// TASK 4
    public static String averegeBoiler (int a, int b, int c, int d, int e) {

        double averege = (a + b + c + d + e) / 5;

        return "Средняя температура = " + averege;
    }
// TASK 5
    public static String toString (double a) {

       return "руб." + "коп.";
    }
// TASK 6
    public static String oString (double a) {
        int num1 = (int) a;
        int num2 = (int)Math.round(100 * (a - num1));

        return num1 + "руб." + num2 + "коп.";
    }
// TASK 7
    public static Double priceAndNumber (double price, double number) {

        return (price * number);
    }

    public static void main(String[] args) {

        taskNumber();
        System.out.println(dayOfWeek(7));
        verifyEqualsString(dayOfWeek(7),"Sunday" );

        taskNumber();
        System.out.println(largestNumber(5, 12, 44));

        taskNumber();
        System.out.println(smallestNumber(5, 12, 44));

        taskNumber();
        System.out.println(averegeBoiler(3, 35, 44, 25, 22));

        taskNumber();
        System.out.println(averegeBoiler(3, 35, 44, 25, 22));

        taskNumber();


        taskNumber();
        System.out.println(priceAndNumber(670, 45));

    }

}
