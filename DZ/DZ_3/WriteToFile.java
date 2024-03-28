package DZ.DZ_3;

import java.io.FileWriter;
import java.io.IOException;

// DZ\DZ_3\

public class WriteToFile {
    private String path = "DZ/DZ_3/files/";

    public void write(String person, String surname) {
        path += surname + ".txt";
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.write(person + "\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
