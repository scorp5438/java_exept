package DZ.DZ_2;

public class Expr {
    public static void main(String[] args) {

        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 0 };
        int d = 0;

        System.out.println(expr(intArray, d));
    }

    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        if (intArray.length < 9) {
            System.out.println(
                    "It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Float.NaN;

        } else if (d == 0) {
            // It's not possible to evaluate the expression - intArray[8] / d as d = 0.
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Float.NaN;

        }
        double res = (double) intArray[8] / d;
        System.out.println(String.format("intArray[8] / d = %d / %d = %.1f", intArray[8], d, res));
        return res;
        // %d - для цифр целых 1 5 8 4 6
        // %s для строк "dfgsdfg"
        // %f для дробрых цифр (%.какое-то число %.2f) кол-во знаков после запятой

    }
}
