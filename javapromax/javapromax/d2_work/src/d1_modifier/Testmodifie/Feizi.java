package d1_modifier.Testmodifie;

import d1_modifier.Fu;

public class Feizi {
    public static void main(String[] args) {
        Fu fu=new Fu();

        /*
           public修饰，本类，同包其他类，其他包的子类，其他包的无关类！
     */
        fu.publicmethod();
    }
}
