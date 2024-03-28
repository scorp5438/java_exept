package Seminars.Seminar_1;

import java.util.ArrayList;
import java.util.List;

// Реализуйте метод checkArray(Integer[] arr),
// принимающий в качестве аргумента целочисленный одномерный массив. 
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// Реализуйте следующую логику:
// 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class CheckArr {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[2] = 10;
        arr[4] = 7;

        checkArray(arr);
    }

    static void checkArray(Integer[] arr) {
        List<Integer> cache = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                cache.add(i);
                // System.out.println("Элементы:");
                // System.out.printf("%d -> " + arr[i] + ", ", i);
            }
        }
        if (!cache.isEmpty())
            throw new RuntimeException("null встретились в индексах: " + cache);
        else
            System.out.println("null не встретились");
    }
}