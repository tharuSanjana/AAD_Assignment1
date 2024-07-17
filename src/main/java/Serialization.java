import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) {
        Student s = new Student("1","Amal","21");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("s.text");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object has been Serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
