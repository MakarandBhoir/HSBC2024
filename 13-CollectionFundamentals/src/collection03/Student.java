package collection03;

public class Student {
    private int studentId;
    private String studentName;
    private double studentScore;

    public Student() {
    }
    public Student(int studentId, String studentName, double studentScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentScore = studentScore;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getStudentScore() {
        return studentScore;
    }
    public void setStudentScore(double studentScore) {
        this.studentScore = studentScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentScore=" + studentScore +
                '}';
    }
    @Override
    public int hashCode(){
        System.out.println("hashCode method...");
        return studentId;
    }
    @Override
    public boolean equals(Object object){
        System.out.println("equals .........");
        Student student = (Student) object;
        if(this.studentId == student.studentId && this.studentName.equals(student.studentName) && this.studentScore == student.studentScore){
            return true;
        }else {
            return false;
        }
    }
}
