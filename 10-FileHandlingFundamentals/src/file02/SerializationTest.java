package file02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) {
        SerializationTest test = new SerializationTest();
        Student student = new Student(1007, "Vaishnavi", 84);
        test.writeObject(student);
        System.out.println("Saved student object to file.");
    }

    public void writeObject(Student student){
        try( FileOutputStream fos = new FileOutputStream("D:/Training/HSBC/Batch3/Core Java/test/students.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos); )
        {

            oos.writeObject(student);
            oos.flush();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Problem writing object to file.");
        }
    }
}
