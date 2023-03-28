package d4_static_singleinstance;

public class Test {
    public static void main(String[] args) {
          /*
    饿汉单例测试！
     */
        /*
        private访问权限
        Singleinstance s=new Singleinstance();
        */

        /*/
        直接调用Singleinstance中的singleinstance对象
         */


        /*
        Singleinstance s=Singleinstance.singleinstance;
        //使用饿汉单例生成的对象都是相同的,因为只提供一个对象！

        Singleinstance s2=Singleinstance.singleinstance;
        System.out.println(s==s2);//为true，地址相同！
        */

        /*/
       懒汉单例测试！
         */
        //报错！Singleinstance s=new Singleinstance();

        //成功！
        Singleinstance s=Singleinstance.getInstance();
        Singleinstance s1=Singleinstance.getInstance();
        System.out.println(s==s1);
    }
}
