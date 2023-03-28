package d5_extend;

public class Student extends People {
    String classes;

    public Student(String classes) {
        this.classes = classes;
    }

    public Student() {
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void reback(){
        System.out.println("填写听课反馈！");
    }
}
