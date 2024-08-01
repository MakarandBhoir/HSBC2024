package exception02;

public class InvalidStudentNameException extends Exception{
    public InvalidStudentNameException(){

    }
    public InvalidStudentNameException(String msg){
        super(msg);
    }
}
