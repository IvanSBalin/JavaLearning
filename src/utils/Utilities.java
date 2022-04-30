package utils;

public class Utilities {

    public static  void  line() {
        System.out.println("_________________________________________________");
    }
    public static  void  ln() {
        System.out.println();
    }

// Тесты
    public static void verifyEqualsString(String actualResult, String expectedResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail"+ "\u001B[0m");
        }
    }
    public static void verifyEqualsInt(int actualResult, int expectedResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }
    public static void verifyEqualsDouble(double actualResult, double expectedResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }
    // Number of task
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
        System.out.println(starStart + "\u001B[35m" + task + numberTask + "\u001B[0m" + starEnd);
        System.out.println(line2);
        System.out.println();

    }
// Number of part
    public static int numberPart = 0;

    public static void partNumber() {

        //counter();
        String task = "PART № ";
        String starStart = "\t\t\t\t\t\t\t\t\t ***** ";
        String starEnd = " *****";
        String line2 = " ///////////////////////////////////////////////////"
                + "////////////////////////////////////////";
        numberPart++;

        System.out.println();
        System.out.println("\u001B[32m" + starStart + task + numberPart + starEnd);
        System.out.print("\u001B[34m" + line2 + "\u001B[0m");
    }
// Method five number to come and return array from these numbers
    public static int[] fiveInComeInt(int a, int b, int c, int d, int e){
        int[] array = new int[]{a, b, c, d, e };

        return array;
    }

// Method five number (type double) to come and return array from these numbers
    public static double[] fiveInComeDouble(double a, double b, double c, double d, double e){
        double[] array = new double[]{a, b, c, d, e };

        return array;
    }

// Method five number (type String) to come and return array from these numbers
    public static String[] fiveInComeString(String a, String b, String c, String d, String e){
        String[] array = new String[]{a, b, c, d, e };

        return array;
    }

    public static boolean conteinsNegativeNumbers(int[] incoming) {
        for (int i = 0; i < incoming.length; i++) {
            if (incoming[i] <= 0) {
                return true;
            }
        }

        return false;
    }

}
