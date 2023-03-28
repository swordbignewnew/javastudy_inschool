package d7_extend_construct;

public class Test {
    public static void main(String[] args) {
        /*/
        子类构造器不管有无参数
        都会先调用父类构造器！
        因为子类继承父类，父类中的内容需要
        先加载完才能轮到子类！
         */
        Dog dog=new Dog();
        System.out.println("---------------");
        Dog dog1=new Dog("泰迪!");

        /*
        此处直接调用子类super（）无参构造器
        指向父类无参构造器
         */
        /*
        Teacher teacher1=new Teacher();
        teacher1.setName("小红");
        teacher1.setAge(18);
        */


        /*/
        不能直接调用有参构造器，需要在子类中把传入的
        参数指向父类！即super（name，age）
         */
        Teacher teacher=new Teacher("李华",20);
        System.out.println(teacher.getAge());
        System.out.println(teacher.getName());
    }
}
