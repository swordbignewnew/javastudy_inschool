package d7_extend_construct;

public class Dog extends Animal{
    Dog(){
        super();//不管写不写都默认有，调用父类无参构造器
        System.out.println("调用子类无参数构造器！");
    }
    Dog(String name){
        super();//不管写不写都默认有，调用父类无参构造器
        System.out.println("调用子类有参数构造器！");
    }
}
