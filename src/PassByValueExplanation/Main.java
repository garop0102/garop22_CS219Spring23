package PassByValueExplanation;

public class Main {

    public static void f(int x){
        x = 99; // x doesn't get copied back to y
    }


    public static void main(String[] args) {
        int y = 1;
        f(y); // y gets copied to x
        System.out.println(y);
    }






}
