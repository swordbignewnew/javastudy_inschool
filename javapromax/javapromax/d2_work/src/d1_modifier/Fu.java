package d1_modifier;

public class Fu {
    /*/
    private修饰，只能在本类中进行访问！
     */
    private void privatemethod(){
        System.out.println("===private===");
    }

    /*/
    缺省方法，只能同包下的类可以进行访问！
     */
    void method(){
        System.out.println("===缺省===");
    }

    /*/
    protect修饰本类，同包其他类，不同包的子类可以进行访问！
     */
    protected void protectedmethod(){
        System.out.println("===protected===");
    }

    /*/
    public修饰，本类，同包其他类，其他包的子类，其他包的无关类！
     */
    public void publicmethod(){
        System.out.println("===public===");
    }

    public static void main(String[] args) {
        Fu fu=new Fu();
        /*/
        本类中都可以访问！
         */
        fu.privatemethod();
        fu.protectedmethod();
        fu.publicmethod();
        fu.method();
    }
}
