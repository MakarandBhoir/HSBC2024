package file01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest02 {
    private static FileInputStream fis = null;

    public void readFile(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        fis = new FileInputStream(file);
        int ch;
        while((ch = fis.read()) != -1){
            System.out.print( (char) ch );
        }
    }
    public static void main(String[] args) {
        try {
            //String fileName = "D:\\Training\\HSBC\\Batch3\\Core Java\\test\\file.txt";
            String fileName = "D:/Training/HSBC/Batch3/Core Java/test/file.txt";
            new FileTest02().readFile(fileName);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("Problem reading file.");
        }
        finally {
            try {
                fis.close();
            }catch (IOException e){
                System.out.println("Problem closing file.");
            }
        }
    }
}
