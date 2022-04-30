package homeWork;

public class HW6 {
// Task #1
    public static void from_0_To_9() {
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
// Task #2
    public static void from_10_To_0() {
        for(int i = 9; i > -1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
// Task #3
    public static void from_50_To_55() {
        for(int i = 50; i < 56; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
// Task #4
    public static void multipleTo7() {
        for(int i = 326; i > 300; i--) {
            if(i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
// Task #5
    public static void printDouble() {
        for(double i = 12 ; i < 13; i += 0.1) {
            //String round = String.format("%.2f",i);
            //System.out.format(round + " ");
            System.out.printf("%.2f", i);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void printDoubleVer2() {
        for(double i = 120 ; i < 131; i++) {
            //String round = String.format("%.2f",i);
            //System.out.format(round + " ");
            System.out.print(((double) i / 10));
            System.out.print(" ");
        }
        System.out.println();
    }
// Task #6
    public static void even_215_To_237() {
        for(int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
// Task #7
    public static void even_215_To_237_Var2() {
        for(int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.println("Null");
            }
        }
        System.out.println();
    }
// Task #8
    public static void shortMultiply_15001() {

        for(short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0 && i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
// Task #9
    public static void blueRedAndZero() {

        for(int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.print("Zero ");
            } else if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + " ");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + " ");
            }
        }
        System.out.println();
    }
    public static void blueRedAndZeroVer2() {

        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.print("\u001B[30m" + "Zero ");
            }
        }
        for (int i = -10; i < 35; i++) {
            if (i % 11 == 0 && i !=0) {
                System.out.print("\u001B[34m" + i + " ");
            }
        }
        for (int i = -10; i < 35; i++) {
            if (i % 12 == 0 && i !=0) {
                System.out.print("\u001B[31m" + i + " ");
            }
        }
        System.out.println("\u001B[30m");
    }
// Task #10
    public static void startEndStep(double start, double end, double step) {
        if (step > 0 && end > start) {
            for (double i = start; i <= end; i += step) {
                //String round = String.format("%.2f",i);
                //System.out.format(round + " ");
                System.out.printf("%.2f", i);
                System.out.print(" ");
            }
        } else if (step > 0 && end < start) {
            for (double i = start; i >= end; i -= step) {
                //String round = String.format("%.2f",i);
                //System.out.format(round + " ");
                System.out.printf("%.2f", i);
                System.out.print(" ");
            }
        } else {
            System.out.println("Invalid date");
        }
        System.out.println();
    }
// Task #11
    public static void sequenceLength(int l) {
        int end = 0;
        for(int i = 0; end < l; i += 2) {
            System.out.print(i + " ");
            end ++;
        }
        System.out.println();
    }
    public static void sequenceLengthVer_2(int l) {
        int end = 0;
        for(int i = 0; end < l; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
                end++;
            }
        }
        System.out.println();
    }
// Task #12
    public static void exponent_2(int n) {
        for(int i = 1; i < n; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
// Task #13
    public static void _0_9999() {
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0; i < 10; i++) {
            System.out.print("" + i + i + " ");
        }
        System.out.println();

        for(int i = 0; i < 10; i++) {
            System.out.print("" + i + i + i + " ");
        }
        System.out.println();

        for(int i = 0; i < 10; i++) {
            System.out.print("" + i + i + i + i + " ");
        }
        System.out.println();
    }
    public static void _0_9999Ver2() {
        for(int i = 0; i < 5; i++) {
            for (int j =0; j < 10; j++) {
                for (int k =1; k <= i; k++){
                    System.out.print(j);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void _0_9999Ver3() {

        String result_1 = "";

        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.print(result_1 +  i + " ");
            System.out.print(result_1 +  i + i + " ");
            System.out.print(result_1 +  i + i + + i + " ");
            System.out.print(result_1 +  i + i + + i + i + " ");
        }
        System.out.println();
    }

// Task #14
    public static void sequence_1_5() {
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.print(0 + ", ");
            } else if (i > 0 && i < 5 ){
                System.out.print(i + ", ");
                System.out.print(i - (i + i) + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print(i - (i + i));
            }
        }
        System.out.println();
    }
// Task #15
    public static void multiplyThreeAndFive() {
        for (int i = 0; i < 26; i++) {
            if(i % 3 == 0 || i % 5 == 0)
            System.out.print(i + " ");
            //System.out.print(i + (i + i) + ", ");
        }
        System.out.println();
    }
// Task #16
    public static void sequenceNML(int start, int step, int length) {
        int end = 0;
        for (int i = start; end < length; i += step) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                end ++;
            }
        }
        System.out.println();
    }
// Task #17
    public static void sequenceN(int n) {
        int numberStep = n + 1;
        int nextStep = n + 2;
        int sequenceStep = nextStep - numberStep;
        for (int i = n; i < (n + 10); i += sequenceStep) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void sequenceNVer2(int n) {
        //int numberStep = n + 1;
        //int nextStep = n + 2;
        //int sequenceStep = nextStep - numberStep;
        int l = n + 5;
        for (; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }
        System.out.println();
    }
// Task #18
//    public static void sequenceN18Ver3(int n, int l) {
         //int numberStep = n + 1;
        //int nextStep = n + 2;
        //int sequenceStep = nextStep - numberStep;

//       if (n < l) {
//           System.out.println("[" + (n) + "]" + " = " + (n));
//           for (int i = n; i < l; n++) {
//               System.out.println("[" + (i) + "]" + " = " + (n * 2));
//               }
//       } else {
//           System.out.println("Invalid data");
//       }
//       System.out.println();
//   }

    //   public static void sequenceN(int n) {

// Task #19
    public static void sequenceDiffernce_3(){
        for(int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++){
                if (j - 4 < i && j + 4 > i) {
                    System.out.println("" + i + "-" + j);
                }
            }
            System.out.println();
        }
    }
// Task #20
//    public static void print20 (double x) {
//        if (x > 1.5) {
//            System.out.println(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
//        } else if (x <= 1.5 )
//    }

    public static void main(String[] args){

        HW4.partNumber();
        HW4.taskNumber();
        from_0_To_9();

        HW4.taskNumber();
        from_10_To_0();

        HW4.taskNumber();
        from_50_To_55();

        HW4.taskNumber();
        multipleTo7();

        HW4.taskNumber();
        printDouble();
        printDoubleVer2();

        HW4.taskNumber();
        even_215_To_237();

        HW4.taskNumber();
        even_215_To_237_Var2();

        HW4.taskNumber();
        shortMultiply_15001();

        HW4.taskNumber();
        blueRedAndZero();
        blueRedAndZeroVer2();

        HW4.taskNumber();
        startEndStep(4,- 3,1.7);

        HW4.partNumber();
        HW4.taskNumber();
        sequenceLength(6);
        sequenceLengthVer_2(6);

        HW4.taskNumber();
        exponent_2(320);

        HW4.taskNumber();
        _0_9999();
        _0_9999Ver2();
        _0_9999Ver3();

        HW4.taskNumber();
        sequence_1_5();

        HW4.taskNumber();
        multiplyThreeAndFive();

        HW4.taskNumber();
        sequenceNML(2, 3,10);

        HW4.taskNumber();
        sequenceN(2);
        sequenceNVer2(2);

        HW4.taskNumber();
        //sequenceN18Ver3(2, 3);

        HW4.taskNumber();
        sequenceDiffernce_3();

        HW4.taskNumber();
    }

}
