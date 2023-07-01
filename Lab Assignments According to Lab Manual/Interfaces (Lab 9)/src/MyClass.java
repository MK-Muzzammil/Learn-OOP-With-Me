class Marks{
    private int oopMarks;
    private int dsaMArks;

    public int getDsaMArks() {
        return dsaMArks;
    }

    public void setDsaMArks(int dsaMArks) {
        this.dsaMArks = dsaMArks;
    }

    public int getOopMarks() {
        return oopMarks;
    }

    public void setOopMarks(int oopMarks) {
        this.oopMarks = oopMarks;
    }
    public int totalMarks(){
        return getOopMarks() +getDsaMArks();
    }

}
class Student{
    Marks marks;

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }
}

public class MyClass {
    public static void main(String[] args) {
        Student std=new Student();
        Marks marks;
        System.out.println(std.getMarks());
        marks=new Marks();
        std.setMarks(marks);
        System.out.println(std.getMarks());
        System.out.println(std.getMarks().getOopMarks());
        std.getMarks().setOopMarks(85);
        System.out.println(std.getMarks().getOopMarks());


    }

}
