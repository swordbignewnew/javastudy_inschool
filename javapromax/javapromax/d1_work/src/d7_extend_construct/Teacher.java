package d7_extend_construct;

public class Teacher extends People{
    public Teacher(String name,int age){
        /*/
        调用父类的有参构造器，初始化继承父类的数据
         */
        super(name, age);//通过super函数指向父类的有参构造器！
    }
}
