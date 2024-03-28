package Seminars.Seminar_1;

// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
// Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
// 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
// 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// 3. если вместо массива пришел null, метод вернет -3

public class GetelemByIndInArr {
    public static int getElemByIndexInArr(int[] array, int minLen, int value) {
        if (array == null)
            throw new NullPointerException("Массив не должен быть null!");
        if (array.length < minLen)
            return -1;
        // int code2 = -2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
                // break;
            }
        }
        return -2;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int result = getElemByIndexInArr(null, 10, 8);
        System.out.println(result);
    }
}
