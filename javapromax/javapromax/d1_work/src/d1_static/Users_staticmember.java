package d1_static;

public class Users_staticmember {
    private  String name;
    private int age;

    public static int num=110;
    /*/
    被static修饰的变量可以被直接访问，而其他的则需要调用get（）方法！
     */

    public Users_staticmember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Users_staticmember() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Users_staticmember.num = num;
    }
}
