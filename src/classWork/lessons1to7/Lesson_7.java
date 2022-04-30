package classWork.lessons1to7;

public class Lesson_7 {

    public static void main(String[] args) {

        String catName = "Рыжик";
// object type String with value "Рыжик"
        String[] catNames;
// object type String-array from eight cells
        catNames = new String[8];

        catNames[1] = "Черныш";
        catNames[4] = "Рыжик";
        catNames[6] = "Рыжик";

        int[] catsAges = new int[8];

        for (int i = 0; i < catNames.length; i++) {
            System.out.print(catNames[i] +" ");
        }
        System.out.println();
        for (int i = 0; i < catNames.length; i++) {
            if (catNames[i] == "Рыжик") {
                System.out.print(catNames[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < catNames.length; i++) {
            if (catNames[i] == "Рыжик") {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(catName);
        System.out.println(catNames);

        System.out.println(catNames[0]);
        System.out.println(catNames[4]);
        System.out.println(catNames[7]);

        System.out.println(catsAges);
        System.out.println(catsAges[0]);

    }

}
