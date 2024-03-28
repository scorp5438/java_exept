import java.util.Arrays;
import java.util.Scanner;

/**
 * Изучите данный код. Все ли с ним хорошо? Если нет,
 * скорректируйте код, попробуйте обосновать свое решение.
 */
public class Task_1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива от 0 до 9, " +
                        "в который хотите записать значение 1");

        int index = 0;
        if (scanner.hasNextInt())
            index = scanner.nextInt();
        else {
            System.out.println("Индекс должен быть целым числом");
            return;
        }
        try {
            arr[index] = 1;
            System.out.println(Arrays.toString(arr));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        }
    }
}