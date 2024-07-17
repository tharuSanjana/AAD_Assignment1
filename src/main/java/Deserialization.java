import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {


    public static void main(String[] args) {
        Student student = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("s.text");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Deserialized Student: " + student);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
