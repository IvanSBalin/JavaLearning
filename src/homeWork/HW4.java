package homeWork;

public class HW4 {
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

    public static void version() {

        //counter();
        String task = " Version 2.0 ";
        //String starStart = " ***** ";
        //String starEnd = " *****";
        String line1 = " --------------------";
        String line2 = " ---------------------";
        //numberTask++;

        System.out.println();
        //System.out.println(line2);
        System.out.println("\u001B[35m" + task + "\u001B[0m");
        System.out.println(line2);
        //System.out.println();

    }

    public static int division(int number_1, int number_2){

        int division = number_1 / number_2;
        //int odd = number_1 % number_2;
        return division;
    }

    public static int remainder(int number_1, int number_2){

        //int division = number_1 / number_2;
        int remainder = number_1 % number_2;
        return remainder;
    }

    public static int divisionAppleForStudents(int number_1, int number_2){

        int division = number_1 / number_2;
        //int odd = number_1 % number_2;
        return division;
    }

    public static int remainderAppleForTeacher(int number_1, int number_2){

        //int division = number_1 / number_2;
        int remainder = number_1 % number_2;
        return remainder;
    }

    public static void applesAndStudents(int number_1, int number_2){

        String message;

        int division = divisionAppleForStudents(number_1, number_2);
        int remainder = remainderAppleForTeacher(number_1, number_2);
        String appleSt;
        String student;
        String appleTech;
        String apple;

        if (division % 10 == 1 && division != 11) {
            appleSt = " яблоку ";
        } else if (division >= 12 && division <=14 || division >= 112 && division <=114){
            appleSt = " яблок ";
        } else if (division % 10 == 2 || division % 10 == 3
                || division % 10 == 4 && division > 20){
            appleSt = " яблока ";
        } else {
            appleSt = " яблок ";
        }

        if (remainder % 10 == 1 && remainder != 11) {
            appleTech = " яблокo ";
        } else if (remainder >= 12 && remainder <=14 || remainder >= 112 && remainder <=114){
            appleTech = " яблок ";
        } else if (remainder % 10 == 2 || remainder % 10 == 3 || remainder % 10 == 4) {
            appleTech = " яблока ";
        } else {
            appleTech = " яблок ";
        }

        if (number_1 % 10 == 1 && number_1 != 11) {
            apple = " яблокo ";
        } else if (number_1 >= 12 && number_1 <=14 || number_1 >= 112 && number_1 <=114){
            apple = " яблок ";
        } else if (number_1 % 10 == 2 || number_1 % 10 == 3 || number_1 % 10 == 4 && number_1 > 20) {
            apple = " яблока ";
        } else {
            apple = " яблок ";
        }

        if (number_2 % 10 == 1 && number_2 != 11) {
            student = " ученик ";
        } else if (number_2 >= 12 && number_2 <= 14 || number_2 >= 112 && number_2 <= 114 ){
            student = " учеников ";
        } else if (number_2 % 10 == 2 || number_2 % 10 == 3 || number_2 % 10 == 4 && number_2 > 20) {
            student = " ученика ";
        } else {
            student = " учеников ";
        }

        message = "Если " + number_1 + " " + apple + " поделить на " + number_2
                + student + ", то каждый ученик получит по " + division + appleSt
                + ", и " + remainder + appleTech + " останется учителю.";

        System.out.println(message);
    }

    public static void celsiusToFahrenheit(double number) {

        System.out.println(number * 1.8 + 32);
    }



    public static void main(String[] args) {
// Задача №1
        taskNumber();

        System.out.println("Класс создан!!!");
// Задача №2
        taskNumber();

        System.out.println("Метод готов!!!");
// Задача №3
        taskNumber();

        if (2 == 2 && 7 == 7){
            System.out.println("Правда");
        }
        if (!(15 < 3)){
            System.out.println("Правда");
        }else {
            System.out.println("Ложь");
        }
        if ("Cосна" == "Дуб" && "Вишня" == "Клён"){
            System.out.println("Правда");
        }else {
            System.out.println("Ложь");
        }
        if (!("Cосна" == "Дуб")){
            System.out.println("Правда");
        }else {
            System.out.println("Ложь");
        }
        if ((!(15 < 3)) && (10 > 20)){
            System.out.println("Правда");
        }else {
            System.out.println("Ложь");
        }
//     if (("Глаза даны, что бы видеть")  && ("Под третьим этажом находится второй этаж")){
//         System.out.println("Правда");
//     }else {
//         System.out.println("Ложь");
//     }
        if ((6 / 2) == 3 || (7 * 5) == 20){
            System.out.println("Правда");
        }else {
            System.out.println("Ложь");
        }
// Задача №4
        taskNumber();

        String sixtySecond = "В минуте 60 секунд";
        String workingWatch = "Работающие часы показывают время";

        if (("В минуте 70 секунд") == sixtySecond
                || ("Работающие часы показывают время") == workingWatch){
            System.out.println("Правда");
        }else {
            System.out.println("Ложь");
        }


        if (!(28 > 7) && !(300 / 5 == 60)){
            System.out.println("Правда");
        }else {
            System.out.println("Ложь");
        }

        String tvSet = "Телевизор - электрический прибор";
        String glass = "Стекло - стекло";

        if (("Телевизор - электрический прибор") == tvSet
                && ("Стекло - стекло") == glass) {
            System.out.println("Правда");
        }else{
            System.out.println("Ложь");
        }


        if (!(300 < 100) ) {
            System.out.println("Жажду можно утолить водой");
        }

        if (!(75 < 81) ) {
            System.out.println("88 != 88");
        }else{
            System.out.println("88 = 88");
        }
// Задача №5
        taskNumber();
        int alex = 20;
        int natasha = 22;
        int sveta = 10;

        if (alex > sveta && natasha > sveta) {
            System.out.println("Света младше всех!");
        }

        int childrenAll = 100;
        int childrenGirls = 60;
        if (childrenAll - childrenGirls < childrenGirls) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
// Задача №6
        taskNumber();

        int age = 15;

        if (age >= 16) {
            System.out.println("Водительские права можно получить!");
        }else{
            System.out.println("Водительские права можно получить,"
                    + " только когда исполнится 16 лет.");
        }
// Задача №7
        taskNumber();
        String goBus = "Петя едет в автобусе, ";
        String readBook = "читает книгу ";
        String lookAtWindow = "смотрит в окно";

//       if (!(goBus) && (readBook) || !(lookAtWindow)) {
//           System.out.println("Водительские права можно получить!");
//       }else {
//           System.out.println("Водительские права можно получить,"
//                   + " только когда исполнится 16 лет.");
//       }
// Задача №8
        taskNumber();

        String ifYouWithFried = "yes";

        if (ifYouWithFried.equals("yes")){
            System.out.println("Хорошо");
        }else {
            System.out.println("Плохо");
        }
// Задача №9
        taskNumber();

        int youAge = 19;

        if(youAge >= 18){
            System.out.println("Ты взрослый");
        }else{
            System.out.println("Ты - ребенок");
        }
        String earth = "сухая";

        if(earth == "сухая"){
            System.out.println("Нет дождя");
        }else{
            System.out.println("Идет дождь");
        }

        if (earth == "сухая") {
            System.out.println("Нет дождя");
        } else if (earth == "мокрая"){
            System.out.println("Идет дождь");
        } else {
            System.out.println("Идет снег");
        }
        String cloud = "тучи";

        if (cloud == "тучи") {
            System.out.println("Нет дождя");
        } else {
            System.out.println("Идет “слепой” дождь");
        }
        String weekDay = "Суббота";

        if (weekDay == "Суббота") {
            System.out.println("Завтра воскресенье");
        } else if (weekDay == "Пятница") {
            System.out.println("Значит, вчера был четверг");
        } else {
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }
        String cancerWhistling = "Нет";

        if (cancerWhistling == "Да") {
            System.out.println("Прошла вечность");
        } else {
            System.out.println("Ждите дальше");
        }
        int youOwnAge = 17;
        String schoolFinish = "Yes";
        if(youOwnAge >= 18 || schoolFinish == "Yes" ) {
            System.out.println("Ты можешь не жить с родителями");
        } else {
            System.out.println("Живи с родителями");
        }
// Задача №10
        taskNumber();

        int number = 13;

        if (number % 2 == 0) {
            System.out.println(number * 2);
        } else {
            System.out.println(number * number);
        }
// Задача №11
        taskNumber();
        int personAge = 16;

        if (personAge >= 18) {
            System.out.println("Можно голосовать");
        } else {
            System.out.println("Голосовать рано");
        }
        if (personAge >= 16) {
            System.out.println("Можно водить машину");
        } else {
            System.out.println("Водить машину рано");
        }
        if (personAge >= 5 && personAge <= 17 ) {
            System.out.println("Можно учится в школе");
        } else if (personAge < 5) {
            System.out.println("Учиться в школе рано");
        } else if (personAge > 17) {
            System.out.println("Поступай в вуз или начинай работать");
        }
// Задача №12
        taskNumber();

        int mark = 3;

        if (mark == 5) {
            System.out.println("Выдать похвальную грамоту и перевести в "
                    + "следующий класс");
        } else if (mark == 4) {
            System.out.println("Перевести в следующий класс");
        } else if (mark == 3) {
            System.out.println("Дать задание на лето и перевести в следующий"
                    + " класс");
        } else if (mark == 2) {
            System.out.println("вызвать родителей и оставить в текущем классе"
                    + " на второй год");
        } else {
            System.out.println("Исключить");
        }
// Задача №13
        taskNumber();

        int evenOrOddNumber_1 = 3;
        int evenOrOddNumber_2 = 3;

        if (evenOrOddNumber_1 % 3 == 0 && evenOrOddNumber_2 % 3 == 0) {
            System.out.println(evenOrOddNumber_1 + evenOrOddNumber_2);
        } else if (evenOrOddNumber_1 % 5 == 0 && evenOrOddNumber_2 % 5 == 0) {
            int sum = evenOrOddNumber_1 - evenOrOddNumber_2;
            if (sum < 0) {
                sum = (- 1) * sum;
            }
        }
// Задача №14
        taskNumber();

        int k = 5;
        int l = 10;
        int m = 15;

        System.out.println("Результат деления k на l = "+ division(k, l)
                + ", а остаток от деления  = " + remainder(k, l));
        System.out.println("Результат деления k на m = "+ division(k, m)
                + ", а остаток от деления  = " + remainder(k, m));
        System.out.println("Результат деления l на k = "+ division(l, k)
                + ", а остаток от деления  = " + remainder(l, k));
        System.out.println("Результат деления l на m = "+ division(l, m)
                + ", а остаток от деления  = " + remainder(l, m));
        System.out.println("Результат деления m на k = "+ division(m, k)
                + ", а остаток от деления  = " + remainder(m, k));
        System.out.println("Результат деления m на l = "+ division(m, l)
                + ", а остаток от деления  = " + remainder(m, l));
// Задача №15
        taskNumber();

        int apples = 100;
        int students = 21;

        System.out.println("Если " + apples + " яблок(а) поделить на "
                + students + " учеников, то каждый ученик получит по "
                + divisionAppleForStudents(apples, students) + " яблок(a),"
                + " и " + remainderAppleForTeacher(apples, students)
                + " яблок(а) останется учителю.");
// Задача №16
        taskNumber();

        applesAndStudents(119, 113);
// Задача №17
        taskNumber();

        celsiusToFahrenheit(37.6);
// Задача №18
        taskNumber();



    }
}
