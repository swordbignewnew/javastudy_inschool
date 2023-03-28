package d8_this_construct;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("李华","明珠中学");
        System.out.println(student.getSchool());
        System.out.println(student.getName());

        System.out.println("------------");

        //未传入学校名称，调用默认值，即莲花中学
        Student student1=new Student("李明");
        System.out.println(student1.getSchool());
        System.out.println(student1.getName());
    }
}
