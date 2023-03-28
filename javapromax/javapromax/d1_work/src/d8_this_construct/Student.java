package d8_this_construct;

public class Student {
    private String name;
    private String school;

    public Student() {
    }

    /*/
    创立学生对象只传名字，
    通过this()方法去调本类的其他同名构造器
    作用：给未传入参数的数据提供默认值！
     */
    public Student(String name){
        this(name,"莲花中学");//借用本类兄弟构造器！

        //**********this（）与super（）都只能放第一行！！！！
    }

    //创立学生对象传入姓名学号调用，若是只传一个那么未传的那个参数为空
    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
