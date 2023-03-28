package d5_extend;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("三年一班");
        student.setName("李华");
        student.setAge(10);
        Teacher teacher=new Teacher("英语");
        teacher.setName("李明");
        teacher.setAge(20);
        System.out.println(student.getName()+student.getAge()+student.getClasses());
        student.getclass();
        student.reback();
        System.out.println(teacher.getName()+teacher.getAge()+teacher.getWork());
        teacher.givequesttion();
        teacher.getclass();
    }
}
