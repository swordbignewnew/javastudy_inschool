package d1_modifier;

public class Test {
    public static void main(String[] args) {
        Fu fu=new Fu();
        //fu.privatemethode();   private修饰不能访问

        /*/
        同包下的其他类，均能访问
         */
        fu.publicmethod();
        fu.method();
        fu.protectedmethod();
    }
}
