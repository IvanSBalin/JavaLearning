package homeWork;

import utils.Utilities;

public class HW10 {

    public static String capitalizeWords(String sentense) {
        // пустой String ="";
        //String str = "null";

        if (sentense != null) {
            sentense = sentense.trim();

            if (sentense.length() != 0) {
                sentense = sentense.substring(0, 1).toUpperCase() + sentense.substring(1);

                for (int i = 1; i < sentense.length(); i++) {
                    if (sentense.charAt(i) == ' ') {
                        sentense = sentense.substring(0, i + 1)
                                + sentense.substring(i + 1, i + 2).toUpperCase()
                                + sentense.substring(i + 2);
                    }
                }
                return sentense;
            }
            return "";
        }
        return "";
    }

    //1. Написать метод, который принимает на вход строку.
//Если строка не пустая (проверить методом из видео), то примените метод по
// удалению пробелов в начале строки и в конце строки.
//Догадаться, каким методом из видео можно проверить, были ли пробелы.
//Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//Если пробелов не было, вернуть сообщение “Пробелов не было”.
//Если строка пустая, вернуть сообщение “Строка пустая”.
    public static String stringAnalise(String input) {

        String isSpace = input.replace(" ", "*");
        String checkSpace;
        if (input.isEmpty()) {

            return "Строка пустая";
        }

        for (int i = 0; i < isSpace.length(); i++) {
            if (isSpace.charAt(i) == '*') {
                input = input.trim();
                //input = input.replace(" ", "");
                checkSpace = "Лишние пробелы удалены";
            } else {
                checkSpace = "Пробелов не было";
            }

            return checkSpace;
        }

        return "";
    }

    //1. Написать алгоритм RemoveAlla.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
// Метод возвращает обработанную строку.
    public static String RemoveAlla(String word) {
        if (word.isEmpty()) {

            return "Строка пустая";
        } else {
            word = word.trim();
            word = word.replace("a", "");
        }

        return word;
    }

    //3. Написать алгоритм RemoveAllZeros.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
// состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
// если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
    public static String RemoveAllZeros(String numbers) {
        if (numbers.isEmpty()) {

            return "Строка пустая";
        } else {
            numbers = numbers.replace(" ", "");
            numbers = numbers.replace("0", "");
        }

        return numbers;
    }

    //4. Написать алгоритм RemoveAllSpaces.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
// Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
// метод возвращает обработанную строку.
    public static String removeAllSpaces(String spaces) {
        if (spaces.isEmpty()) {

            return "Строка пустая";
        } else {
            spaces = spaces.replace(" ", "");
        }

        return spaces;
    }

    //5. Напишите метод, который принимает на вход строку и считает, сколько букв а
// или А содержится в строке.
    public static int countAllA(String text) {
        text = text.toUpperCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A') {
                count += 1;
            }
        }
        return count;
    }

    //6. Напишите метод, который принимает на вход текст и проверяет, содержится ли
// в тексте хотя бы одно слово Java.
    public static boolean isJavaContain(String text) {
        if (text.contains(" Java ")) {

            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords("       happy birthday"));
        System.out.println(capitalizeWords("john jacob smith junior"));
        System.out.println(capitalizeWords(" "));

        Utilities.partNumber();
        Utilities.taskNumber();
//1. Test Data:
//“    QA4Everyone   “ → “Лишние пробелы удалены”
//“QA4Everyone“ → “Пробелов не было”
//“” → “Строка пустая”
        Utilities.verifyEqualsString(stringAnalise("    QA4Everyone   ")
                , "Лишние пробелы удалены");
        Utilities.verifyEqualsString(stringAnalise("QA4Everyone")
                , "Пробелов не было");
        Utilities.verifyEqualsString(stringAnalise("")
                , "Строка пустая");

        Utilities.taskNumber();
//2. Test Data:
// “    QA4Everyone   “ →  “QA4Everyone“
//“panda   “ → “pnd”
        Utilities.verifyEqualsString(RemoveAlla("    QA4Everyone   ")
                , "QA4Everyone");
        Utilities.verifyEqualsString(RemoveAlla("panda   ")
                , "pnd");

        Utilities.taskNumber();
//3. Test Data:
// “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//“ 0000000111“ → “111”
        Utilities.verifyEqualsString(RemoveAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ")
                , "35429764");
        Utilities.verifyEqualsString(RemoveAllZeros(" 0000000111")
                , "111");

        Utilities.taskNumber();
//4. Test Data:
// “    QA   4  Everyone   “ →  “QA4Everyone“
//“p a     n d a   “ → “panda”
        Utilities.verifyEqualsString(removeAllSpaces("    QA   4  Everyone   ")
                , "QA4Everyone");
        Utilities.verifyEqualsString(removeAllSpaces("p a     n d a   ")
                , "panda");

        Utilities.taskNumber();
//5. Test Data:
//“Abracadabra” → 5
//“Homenum Revelio” → 0
        Utilities.verifyEqualsInt(countAllA("Abracadabra")
                , 5);
        Utilities.verifyEqualsInt(countAllA("Homenum Rovelio")
                , 0);

        Utilities.taskNumber();
//Test Data:
//“As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are
// the current long-term support (LTS) versions. Oracle released the last
// zero-cost public update for the legacy version Java 8 LTS in January 2019 for
// commercial use, although it will otherwise still support Java 8 with public
// updates for personal use indefinitely. Other vendors have begun to offer
// zero-cost builds of OpenJDK 8 and 11 that are still receiving security and
// other upgrades.” → true
//
//“As a decrepit father takes delight
//To see his active child do deeds of youth,
//So I, made lame by fortune’s dearest spite,
//Take all my comfort of thy worth and truth.
//For whether beauty, birth, or wealth, or wit,
//Or any of these all, or all, or more,
//Entitled in thy parts do crownèd sit,
//I make my love engrafted to this store.
//So then I am not lame, poor, nor despised,
//Whilst that this shadow doth such substance give
//That I in thy abundance am sufficed,
//And by a part of all thy glory live.
//Look what is best, that best I wish in thee.
//This wish I have; then ten times happy me.” → false
        Utilities.verifyEqualsBoolean(isJavaContain("As of March 2022, Java "
                        + "18 is the latest version, while Java 17, 11 and 8 are "
                      +  "the current long-term support (LTS) versions. Oracle "
                      +  "released the last zero-cost public update for the legacy "
                      + "version Java 8 LTS in January 2019 for commercial use, "
                       + "although it will otherwise still support Java 8 with "
                       + "public updates for personal use indefinitely. Other "
                       + "vendors have begun to offer zero-cost builds of OpenJDK "
                       + "8 and 11 that are still receiving security and other upgrades.")
                , true);
        Utilities.verifyEqualsBoolean(isJavaContain("As a decrepit father takes delight\n" +
                        "To see his active child do deeds of youth,\n" +
                        "So I, made lame by fortune’s dearest spite,\n" +
                        "Take all my comfort of thy worth and truth.\n" +
                        "For whether beauty, birth, or wealth, or wit,\n" +
                        "Or any of these all, or all, or more,\n" +
                        "Entitled in thy parts do crownèd sit,\n" +
                        "I make my love engrafted to this store.\n" +
                        "So then I am not lame, poor, nor despised,\n" +
                        "Whilst that this shadow doth such substance give\n" +
                        "That I in thy abundance am sufficed,\n" +
                        "And by a part of all thy glory live.\n" +
                        "Look what is best, that best I wish in thee.\n" +
                        "This wish I have; then ten times happy me.")
                , false);
    }
}
