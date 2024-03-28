import java.text.NumberFormat;

import javax.management.RuntimeErrorException;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task_2 {
    public static void main(String[] args) {
        String[][] arr = new String[][] {
                { "1", "1", "12" },
                { "1", "13", "1", "1", "1" },
                { "1", "7" },
                { "е" },
                { "2", "6" }
        };

        System.out.println(sum2d(arr));
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isInteger(arr[i][j])) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } else {
                    throw new RuntimeException("Неверные данные");
                }
            }
        }
        return sum;
    }

    private static boolean isInteger(String data) {
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e) {
            return false;

        }
    }
}