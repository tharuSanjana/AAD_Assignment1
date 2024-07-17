import java.io.*;

public class Student implements Serializable {

    String id;
    String name;
    String age;

    public static void main(String[] args) {
        Student s = new Student();
        s.id = "1";
        s.name = "Amal";
        s.age = "21";


        // Serialize the student object
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("s.text");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object has been Serialized");
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deserialize the student object
        try{
            FileInputStream fileInputStream = new FileInputStream("s.text");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student deSerialization = (Student) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Deserialized Student: " + deSerialization);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
