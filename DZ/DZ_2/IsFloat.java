package DZ.DZ_2;

public class IsFloat {
    public static void main(String[] args) {

        String input = "sad";
        System.out.println(isFloat(input));
    }

    public static float isFloat(String input) {

        // Введите свое решение ниже
        try {
            Float res = Float.parseFloat(input);
            return res;
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }
    }
}
