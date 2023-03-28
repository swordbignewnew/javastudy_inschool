package d4_interface;
/*/
声明一种接口，体现一种规范，规范一定是公开的!
借口中只能有抽象方法和常量
 */
public interface InterfaceDemo {
    //public static final String name="happy";
    /*/
    因为接口是一种规范，所以其中的量一定是public
    修饰的，就算不写也默认有public
     */
    String name="happy";

    void run();//public abstract void run();
    void eat();//public abstract void eat();
}
