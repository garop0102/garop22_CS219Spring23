package Day4_LogicExercises;

public class MysteryIf {
    public static void mystery2(int a, int b) {
        if (a % b == 0) {
            a = a / b;
            if (a < b) {
                b = b - a;
            }
        } else if (b % 2 == 0) {
            b = b / 2;
        } else {
            a = a - b;
        }
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        mystery2(20, 4);
        mystery2(7, 6);
        mystery2(13, 9);
    }
}
