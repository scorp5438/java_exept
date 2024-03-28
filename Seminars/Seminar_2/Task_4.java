import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Task_4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = { "asdf", "asdf" };
            String str = strings[1];
            test();
            int a = 1 / 0;

            inputStream = new FileInputStream("sdafgdsaf");
        } catch (StackOverflowError error) {
            System.err.println("stack overflow error");
        } catch (Throwable e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");

    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }

    private boolean isFloat(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
