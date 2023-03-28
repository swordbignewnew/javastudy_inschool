package d2_static_until;

public class test {
    public static void main(String[] args) {
        /*/
        通过调用工具类的creatcode方法
        生成五位随机验证码！
         */
        System.out.println(toolclass.creatcode(5));

        /*/
        toolclass ts=new toolclass();
        该对象无法创建，因为在工具类中
        对创建对象方法进行了private处理
        成为了私有方法！
         */

        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=toolclass.avg_get(arr);
        System.out.println(k);
        System.out.println(toolclass.toString(arr));
    }
}
