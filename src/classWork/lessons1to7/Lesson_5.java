package classWork.lessons1to7;

public class Lesson_5 {

    public static int returnMinOfThree (int number1, int number2, int number3) {

        int min;

        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }
        if (min < number3) {

            return min;
        } else {
            min = number3;

            return min;
        }
    }

    public static double returnAverage(int number1, int number2, int number3) {

        return ((double) number1 + number2 + number3) / 3;

        //double average = (number1 + number2 + number3) / 3;

        //return average;
    }

    public static double returnAbs(double number) {

        if (number < 0) {
            number = (-1) * number;
        }

        return number;

    }


    public static double returnDifference(int number1, int number2, int number3) {

        int min = returnMinOfThree(number1, number2, number3);
        double average = returnAverage(number1, number2, number3);

        double difference = min - average;

        return  returnAbs(difference);

    }

    public  static String displayMessage(int number1, int number2, int number3) {

        String message;

        if (returnDifference(number1, number2, number3) > 3.51) {
            message = "Большой разброс чисел";
            System.out.println(message);
        } else {
            message = "Маленький разброс чисел";
            System.out.println(message);
        }

        return message;
    }



    public static void main(String[] args) {

        int a = 3;
        int b = 3;
        int c = 3;

        System.out.println(returnMinOfThree(a, b, c));
        System.out.println(returnAverage(a, b, c));
        displayMessage(a,b,c);

    }
}
