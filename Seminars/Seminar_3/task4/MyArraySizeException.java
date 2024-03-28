package Seminars.Seminar_3.task4;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException() {
        super("Массив должен быть 3х3");
    }
}
