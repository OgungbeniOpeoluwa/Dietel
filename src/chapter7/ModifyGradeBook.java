package chapter7;

public class ModifyGradeBook {
    private int numberOfStudent;
    private int numberOfExam;
    private String courseName;
    private int[][] grade;

    public ModifyGradeBook(int numberOfStudent, int[][] grade, int numberOfExam, String courseName) {
        this.courseName = courseName;
        this.numberOfStudent = numberOfStudent;
        this.numberOfExam = numberOfExam;
        this.grade = grade;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setNumberOfStudent(int numberOfStudent){
        this.numberOfStudent = numberOfStudent;
    }


}


