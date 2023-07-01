public class StudentRecord_Act_1 {
    private String studentDegree;

    public StudentRecord_Act_1(){

    }
    public StudentRecord_Act_1(String studentDegree){
        this.studentDegree=studentDegree;
    }

    public String getStudentDegree() {
        return studentDegree;
    }

    public void setStudentDegree(String studentDegree) {
        this.studentDegree = studentDegree;
    }

    public String toString(){
        return String.format("Student Degree %s ",studentDegree);
    }
}
