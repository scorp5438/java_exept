package Seminars.Seminar_1;

// Реализуйте метод,принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум
// Если длина массива меньше некоторого заданного минимума,метод возвращает-1
// в качестве кода ошибки,иначе-длину массива.

public class GetArrLen {
    public static int getArrayLength(int[] array, int minLen) {
        if (array.length < minLen)
            return -1;
        else
            return array.length;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int result = getArrayLength(arr1, 10);
        System.out.println(result);
    }
}
