package DZ.DZ_2;

import javax.management.RuntimeErrorException;

public class Expr3 {
    public static void main(String[] args) {
        char a = ' ';
        System.out.println(expr(a));
    }

    public static String expr(char a) {
        // Введите свое решение ниже
        if (a == ' ') {
            throw new RuntimeException("Empty string has been input.");
        }
        return String.format("Your input was - %s", a);

    }
}
