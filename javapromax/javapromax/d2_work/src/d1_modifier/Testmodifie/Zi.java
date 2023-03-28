package d1_modifier.Testmodifie;

import d1_modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi zi=new Zi();
        /*/
        protect修饰本类，同包其他类，不同包的子类可以进行访问！
         */
        zi.protectedmethod();
        zi.publicmethod();
    }
}
