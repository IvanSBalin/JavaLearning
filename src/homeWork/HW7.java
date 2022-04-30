package homeWork;

import java.util.Arrays;
import java.util.Random;

public class HW7 {

    public static double printAverageAge(double[] catsAges) {
        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum += catsAges[i];
        }
        return (sum / catsAges.length);
    }

    public static int[] minMaxAverage(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int average;
        int sum =0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > min) {
                max = array[i];
            }
            sum += array[i];
        }
        average = sum / array.length;

        int[] arr = {min, max, average};

        return arr;
    }



    public static void main(String[] args) {

        String[] catsNames;
        catsNames = new String[8];

        catsNames[0] = "Боня";
        catsNames[1] = "Черныш";
        catsNames[2] = "Васька";
        catsNames[3] = "Дункан";
        catsNames[4] = "Рыжик";
        catsNames[5] = "Фридрих";
        catsNames[6] = "Барсик";
        catsNames[7] = "Феликс";

        String[] catsColors;
        catsColors = new String[8];

        catsColors[0] = "dark grey";
        catsColors[1] = "black";
        catsColors[2] = "grey";
        catsColors[3] = "dark grey";
        catsColors[4] = "red";
        catsColors[5] = "light grey";
        catsColors[6] = "red";
        catsColors[7] = "light grey";

        double[] catsAges;
        catsAges = new double[8];

        catsAges[0] = 1;
        catsAges[1] = 4;
        catsAges[2] = 5;
        catsAges[3] = 6;
        catsAges[4] = 2;
        catsAges[5] = 3;
        catsAges[6] = 2;
        catsAges[7] = 2;

        boolean[] isCatsRed;
        isCatsRed = new boolean[8];

        isCatsRed[0] = false;
        isCatsRed[1] = false;
        isCatsRed[2] = false;
        isCatsRed[3] = false;
        isCatsRed[4] = true;
        isCatsRed[5] = false;
        isCatsRed[6] = true;
        isCatsRed[7] = false;

        HW4.partNumber();
        HW4.taskNumber();
        System.out.println("Arrays is ready!");

        HW4.taskNumber();
//  имя кота в коробке с номером 6
        System.out.println(catsNames[6]);

        HW4.taskNumber();
//  имена котов из коробок с четными индексами
        for (int i = 0; i < catsNames.length; i += 2) {

            System.out.println(i + " " + catsNames[i]);
        }
        HW4.version();
        for (int i = 0; i < catsNames.length; i += 2) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i + " " + catsNames[i]);
            }
        }
        HW4.taskNumber();
//  имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < catsNames.length; i += 4) {

            System.out.println(i + " " + catsNames[i]);
        }
        HW4.version();
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0 && i != 0) {
                System.out.println(i + " " + catsNames[i]);
            }
        }
        HW4.taskNumber();
//  цвет котов из коробок с нечетными индексами
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0 && i != 0) {
                System.out.println(i + " " + catsNames[i] + " - " + catsColors[i]);
            }
        }
        HW4.taskNumber();
//  цвет котов из коробок с нечетными индексами
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(i + " " + catsNames[i] + " - " + catsColors[i]);
            }
        }
        HW4.taskNumber();
//  Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i] == "grey") {
                System.out.println(i + " " + catsNames[i] + " голодный."
                        + " Накорми кота.");
            } else if (catsColors[i] == "dark grey") {
                System.out.println(i + " " + catsNames[i] + " голодный."
                        + " Накорми кота.");
            } else if (catsColors[i] == "light grey") {
                System.out.println(i + " " + catsNames[i] + " голодный."
                        + " Накорми кота.");
            }
        }
        HW4.taskNumber();
//  Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println(i + " " + catsNames[i] +" молодой и может заболеть."
                        + "Отнеси кота на прививку!");
            }
        }
        HW4.taskNumber();
//  Для кота в последней коробке распечатать имя, цвет, возраст
        int endArrays = catsNames.length - 1;
        System.out.println(catsNames[endArrays] + " / " + catsColors[endArrays]
                + " / " + catsAges[endArrays] + " года");

        HW4.taskNumber();
//  Распечатать имена всех котов, чей возраст больше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(i + " " + catsNames[i]);
            }
        }
        HW4.taskNumber();
//  Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
        if (isCatsRed.length == catsNames.length && isCatsRed.length != 0) {
            for (int i = 0; i < isCatsRed.length; i++) {
                if (isCatsRed[i] == true && catsNames[i].equals("Рыжик")) {
                System.out.println(i + " " + catsNames[i] + " голодный." + " Накорми кота!");
                }
            }
        }
        HW4.partNumber();
        HW4.taskNumber();
//  Распечатать средний возраст котов из массива catsAges
        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum += catsAges[i];
        }
        System.out.printf("%.1f%n",sum / catsAges.length);
        HW4.taskNumber();
//  Распечатать возраст самого молодого кота
        double youngestCat = Double.MAX_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (youngestCat > catsAges[i]) {
                youngestCat = catsAges[i];
            }
        }
        System.out.println("Возраст самого молодого кота " + youngestCat);
        HW4.taskNumber();
//  Распечатать возраст самого старого кота
        double oldestCat = Double.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (oldestCat < catsAges[i]) {
                oldestCat = catsAges[i];
            }
        }
        System.out.println("Возраст самого старого кота " + oldestCat);
        HW4.taskNumber();
//  Распечатать количество серых котов
        int greyCats = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("grey") || catsColors[i].equals("light grey")
            || catsColors[i].equals("dark grey")) {
                greyCats ++;
            }
        }
        System.out.println("Серых котов " + greyCats);
        HW4.taskNumber();
//  Распечатать имя кота, если кот находится в коробке с четным индексом
//  и его возраст не больше 3 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (i % 2 == 0 && i != 0 && catsAges[i] < 3) {
                System.out.println(i + " " + catsNames[i] + " " + catsAges[i]);
            }
        }
        HW4.taskNumber();
//  Создать массив четных положительных чисел, значения которых не больше 10.
//  (заполняем значения с помощью цикла for)
        int arrayLenght = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 != 0 && i != 0) {
                arrayLenght++;
            }
        }
        System.out.println(arrayLenght);
        int[] evenNumber = new int[arrayLenght];
        //int index = 0;
        for (int i = 0, index = 0 ; i < 12; i++){
            if (i % 2 == 0 && i != 0){
                evenNumber[index] = i;
                //index++;
                System.out.print(evenNumber[index] + " ");
                index++;
            }
        }
        System.out.println(evenNumber.length);
        System.out.println();
        HW4.taskNumber();
//  Написать метод, который принимает на вход массив int, и возвращает среднее
//  значение. Проверить работу метода тестом, если параметр - массив catsAges
        System.out.println(printAverageAge(catsAges));

        System.out.println();
        HW4.taskNumber();
//  Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
        int negativeNumber = 0;
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                negativeNumber++;
            }
        }
        System.out.println(negativeNumber);
        int[] oddNegativeNumber = new int[negativeNumber];
        int index1 = 0;
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                oddNegativeNumber[index1] = i;
                System.out.println(oddNegativeNumber[index1] + " ");
                index1 ++;
            }
        }

        HW4.taskNumber();
//  21. Создать массив из 10 случайных положительных целых чисел
        int[] randomArray = new int[10];
        //int index2 = 0;
        for (int i = 0; i < randomArray.length; i++) {
            int n = (int)(Math.random() * 10) ;
            randomArray[i] = n;
                System.out.println(randomArray[i] + " ");
                //index2 ++;
        }

        HW4.partNumber();
        HW4.taskNumber();
//  21. Создать метод, который принимает на вход массив int,  и возвращает минимальное
//  значение, максимальное значение и среднее значение всех чисел массива.
//  Проверить работу метода на массиве из задания 20.
        System.out.println(Arrays.toString(minMaxAverage(randomArray)));

        HW4.taskNumber();
//  22. Создать массив четных чисел и массив нечетных чисел из элементов массива из
//  задания 20.
        int lengthEven = 0;
        int lengthOdd = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0) {
                lengthEven++;
            } else {
                lengthOdd++;
            }
        }
        int[] even = new int[lengthEven];
        int[] odd = new int[lengthOdd];
        int numberEven = 0;
        int numberOdd =0;

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 0 && numberEven < even.length) {
                even[numberEven] = randomArray[i];
                numberEven++;
            } else if (randomArray[i] % 2 != 0 && numberOdd < odd.length) {
                odd[numberOdd] = randomArray[i];
                numberOdd++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        HW4.taskNumber();
//  23. Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
//  Распечатать все данные котов в коробках с четными индексами, используя
//  двумерный массив.
        String[][] massiv2D = {{"Мурзик", "2", "Серый"},
                {"Черныш", "3", "Черный"},
                {"Мурка", "4", "Серый"},
                {"Васька", "1", "Коричневый"},
                {"Рыжик", "5", "Красный"},
                {"Дымка", "6", "Серый"},
                {"Мурзик", "9", "Красный"},
                {"Зорро", "10", "Серый"}};
        for (int i = 0; i < 8; i++) {
            if (i !=0 && i % 2 == 0) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(massiv2D[i][j] + "\t");
                }
            } else if (i %2 != 0 && i != 1 && i != 7) {
                    System.out.println();
            }
        }

        HW4.taskNumber();
//  24. Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
        int[][] array4To8 = new int[4][8];
        for (int i = 0; i < array4To8.length; i++) {
            for (int j = 0; j < array4To8[i].length; j++) {
                array4To8[i][j] = (int)(Math.random() * 10) + 1;
                System.out.print(array4To8[i][j] + " ");
            }
            System.out.println();
        }

        HW4.taskNumber();
//  25. Вывести сумму всех четных чисел массива из задания 24.
        int sum_Sum = 0;
        for (int i = 0; i < array4To8.length; i++) {
            for (int j = 0; j < array4To8[i].length; j++) {
                if (array4To8[i][j] % 2 == 0) {
                    sum_Sum += array4To8[i][j];
                }
            }
        }
        System.out.println("Сумма: " + sum_Sum);
    }
}
