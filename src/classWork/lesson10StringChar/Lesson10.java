package classWork.lesson10StringChar;

import java.util.Arrays;
import java.util.Locale;

public class Lesson10 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        System.out.println(str1 + space + str2 + space + str3);

        String str4 = str1 + space + str2 + space + str3;

        System.out.println(str4.length());
        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(3));
        //System.out.println(str1.charAt(4));
        for (int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i));
        }

        for (int i = 0; i <str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                //array[i]
                System.out.println(str4.charAt(i));
            } else {
                System.out.println("Letter is not a");
            }
        }

        for (int i = 0; i <str4.length(); i++) {
            if (str4.charAt(i) >= 'i') {
                //array[i]
                System.out.println(str4.charAt(i));
            } else {
                System.out.println("< i");
            }
        }

        System.out.println(Character.toString('i' + 1));
        System.out.println((char)('i' + 1));
        System.out.println(Character.toString('i' + 1));

        // Переводим строку в массив букв
        String[] arrayStr = new String[str4.length()];

        for (int i = 0; i < str4.length(); i++) {
            arrayStr[i] = Character.toString(str4.charAt(i));
        }

        System.out.println(Arrays.toString(arrayStr));

        System.out.println(str4.toCharArray());

        char[] arrayChar = str4.toCharArray();
        System.out.println(arrayStr[0].equals(arrayChar[0]));
        System.out.println(arrayStr[0].compareTo(Character.toString(arrayChar[0])));
      //  if (arrayStr[0].compareTo(Character.toString(arrayChar[0])) == 0) {
      //  }
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());
        System.out.println(str1.compareToIgnoreCase(str4));
    }
}
