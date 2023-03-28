package d1_static;

import d1_static.Student_staticmethod;
import d1_static.Users_staticmember;

public class staticdemo {
    public static void main(String[] args) {
        /*/
        静态成员变量可以直接通过类名访问
         */
        System.out.println(Users_staticmember.num);

        /*/
        静态成员方法也可以直接通过类名访问
         */
        Student_staticmethod.getmax(12,13);


    }
}
