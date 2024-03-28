package DZ.DZ_2;

public class Expr2 {
    public static void main(String[] args) {

        int a = 12;
        int b = 5;
        System.out.println(expr(a, b));
    }

    public static double expr(int a, int b) {
        if (b == 0) {
            printSum(a, b);
            return 0;
        }
        printSum(a, b);
        double res = (double) a / b;
        return res;

    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

}
