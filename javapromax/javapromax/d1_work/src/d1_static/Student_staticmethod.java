package d1_static;

public class Student_staticmethod {
    private String name;

    public static void main(String[] args) {
        getmax(12,13);
        //study();
        /*/
        直接调用study方法报错，因为不含static的方法属于对象，
        只能通过对象进行访问
         */
        Student_staticmethod student_staticmethod=new Student_staticmethod();
        student_staticmethod.name="teru";
        student_staticmethod.study();
        /*/
        通过对象即可进行访问！
         */
    }

    /*/
    static修饰的方法可以直接反问
     */
    public static void getmax(int age1,int age2){
        System.out.println(age1 > age2 ? age1 : age2);
    }

    public void study(){
        System.out.println(name+"好好学习吃得多！");
    }
}
