public class MainClass {
    public static void main(String args[]){
        byte a = 1; short b = 2; int c = 3; long d = 4; float e = 5.1f; double f = 6.01; boolean g = true; char h = 'A';

        System.out.println(actions(3, 4, 6, 2));
        System.out.println(bool(9, 4));
        System.out.println(trueFalse(4));
        System.out.println(nig(-6));
        hell("Саня");
        year(1600);
    }
 
    public static float actions(float a1, float b1, float c1, float d1) {
        return a1 * (b1 + c1 / d1);
    }

    public static Boolean bool(float a1, float b1) {
        return a1 + b1 >= 10 && a1 + b1 <= 20;
    }

    public static String trueFalse(int a1) {
        return a1 >= 0 ? "positive" : "negative";
    }

    public static Boolean nig(int a1) {
        return a1 < 0;
    }

    public static void hell(String a1) {
        System.out.printf(String.format("Привет, %s" + "\n", a1));
    }

    public static void year(int a1) {
        System.out.println(a1 % 4 == 0 && a1 % 100 != 0 || a1 % 400 == 0 ? "високосный" : "ноуп");
    }
}
