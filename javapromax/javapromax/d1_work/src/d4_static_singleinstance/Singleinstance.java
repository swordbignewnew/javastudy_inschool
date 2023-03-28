package d4_static_singleinstance;
/*/
饿汉单例：在其他类获取对象!前!已经准备好对象
在实际开发中我们不能让对象无限创建
而是只准备一个对象！
 */
public class Singleinstance {
    /*/
    提前准备好对象
    即在加载类时就可以拿得到
     */

    /*/
    对象设为公有静态，确保其他类直接可以访问！
     */
    //public static Singleinstance singleinstance=new Singleinstance();

    /*/
    将创建对象的方法隐藏，
    使得外界只能获取一个对象！
     */

/*/
懒汉单例：在其他类获取对象！时!已经准备好对象
在实际开发中我们不能让对象无限创建
而是只准备一个对象！
 */


    /*/
    定义一个静态成员变量，只加载一次，生成一份
    最好以private修饰
    因为变量为null，可能给别人挖坑！
     */

    private static Singleinstance singleinstance;//创建变量但是不生成对象！

    /*/
    懒汉通过调用get()方法得到对象！
     */

    public static Singleinstance getInstance(){
        //判断是否为空，为空说明没有生成，则创建一个对象，反正返回对象，防止生成多个对象！
        if (singleinstance==null){
            singleinstance=new Singleinstance();
        }
        return singleinstance;
    }


    //私有化构造方法，不让对象创建！
    private Singleinstance() {
    }
}
