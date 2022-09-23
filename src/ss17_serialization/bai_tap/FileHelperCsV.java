package ss17_serialization.bai_tap;


import java.io.*;
import java.util.List;

public class FileHelperCsV {
    protected void writeFile(String path, Object o) {

        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(
                             new FileOutputStream(path))) {
            outputStream.writeObject(o);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    protected Object readFile(String path) {
        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream(path)
                     )) {

            return input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
        return null;
    }
}
