package d2_static_until;

import java.util.Random;

public class toolclass {

    private toolclass(){
        /*/
        将创建对象的方法进行私有化
        使其他类无法创建toolclass类
        只能使用其静态方法，节省内存
        完全成为工具类
         */
    }




    /*/
    设置一个静态的生成验证码的方法！
    供给所有类使用1
     */
    public static String creatcode(int n){
        String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rd=new Random();
        String c= new String();
        for (int i = 0; i < n; i++) {
            int index= rd.nextInt(data.length());
            char ch= data.charAt(index);
            c+=ch;
        }
        return  c;
    }


    /*/
    设置一个静态的输入数组返回字符串的方法
    供所有类使用！
     */

    public static String toString(int[] arr){
        if (arr==null){
            return null;
        }
        else {
            String s="";
            for (int i = 0; i < arr.length; i++) {
                s+=arr[i];
            }
            return s;
        }
    }



    /*/
    设置一个方法，对输入的的数组
    去掉最大值和最小值，然后返回平均值！
     */

    public static int avg_get(int[] arr){
        int max=arr[0],min=arr[0];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
            sum+=arr[i];
        }
        sum=sum-max-min;
        int avg=sum/(arr.length-2);
        return avg;
    }

}
