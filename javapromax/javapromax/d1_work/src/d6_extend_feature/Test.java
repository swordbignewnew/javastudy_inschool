package d6_extend_feature;

public class Test {
    public static void main(String[] args) {
        /*/
        子类可以直接调用父类静态方法
        但是这不属于继承
        属于共享
         */
        Tiger tiger= new Tiger();
        System.out.println(tiger.location);

        /*/
        根据就近原则，子类有优先调子类
        子类没有再去父类查找！
         */
        tiger.run();

        //tiger.eat();

        /*/
        子类不能调用父类私有方法，
        这不意味不能继承
        而是继承了无法直接访问
         */
    }

    static class  Animal{
        private void  eat(){
            System.out.println("吃肉~");
        }
        public static String location = "西安动物园";

        public void run(){
            System.out.println("动物跑得快");
        }
    }
    static class Tiger extends Animal{
        /*/
        对父类的方法进行重写，要加上@Override
        表示直接对方法进行了重写，要不然写错了可能误以为
        创建了新的方法！
         */
        @Override//重写校验注解！
        public void run(){
             /*/
            若要调用父类，使用super关键字
             */
            super.run();//调用父类run方法！
            System.out.println("老虎跑得快！");
        }
    }
}
