package Seminars.Seminar_3.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(divideByZero(5, 2));

        try {
            nonExistedFile("null");
        } catch (NonExistedFileException e) {
            e.printStackTrace();
        }
    }

    public static double divideByZero(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        double res = a / b;
        return res;
    }

    public static void nonExistedFile(String path) throws NonExistedFileException {
        try {
            FileReader fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException();
        }
    }
}
