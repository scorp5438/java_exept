package Seminars.Seminar_3.task4;

import java.util.Map;

public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(int x, int y) {
        super(String.format("В ячейке [%s][%s] не число", x, y));
    }

    public MyArrayDataException(Map<Point2d, String> cache) {
        super(String.format("Невалидные данные %s%n", cache));
    }
}
