package exception02;

public class Test {
    static boolean checkStudentName(String studentName)throws InvalidStudentNameException{
        boolean result = studentName.matches("[a-zA-Z]+");
        if(!result){
            throw new InvalidStudentNameException("Invalid Name = "+studentName);
        }
        return result;
    }
    public static void main(String[] args) {
        String studentName = "Swathi1@";
        try {
            System.out.println(checkStudentName(studentName));
        }
        catch (InvalidStudentNameException e){
            System.out.println(e.getMessage());
        }
    }
}
