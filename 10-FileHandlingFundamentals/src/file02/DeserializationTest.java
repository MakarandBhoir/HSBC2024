package file02;

import java.io.*;

public class DeserializationTest {
    public Student readObject(){
        Student result = null;
        try (FileInputStream fis = new FileInputStream("D:/Training/HSBC/Batch3/Core Java/test/students.ser");
             ObjectInputStream ois = new ObjectInputStream(fis);)
        {
            Student student = (Student) ois.readObject();
            result = student;
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    public static void main(String[] args) {
        Student student = new DeserializationTest().readObject();
        System.out.println(student);
    }
}
