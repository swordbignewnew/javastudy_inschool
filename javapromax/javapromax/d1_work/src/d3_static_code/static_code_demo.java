package d3_static_code;

public class static_code_demo {
    /*/
    在main（）方法前设置静态代码块，
    优先于main（）方法触发
    属于类，类执行则触发一次！


    作用：用于初始化静态资源！
     */

    static {
        System.out.println("静态代码块触发！");
    }

    /*/
    实例代码块，属于对象，对象创建触发！

     */

    {
        System.out.println("实例代码块触发！");
    }
    public static void main(String[] args) {
        /*/
        若不创建对象不触发！
         */
        //static_code_demo s1=new static_code_demo();

        System.out.println("main方法触发！");
    }
}
