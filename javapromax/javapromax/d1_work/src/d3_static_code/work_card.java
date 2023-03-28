package d3_static_code;

import java.util.ArrayList;

/*/
对于斗地主游戏，卡牌总是为54张
使用静态代码块提前定义牌组！
可以节省资源！
 */
public class work_card {
    public static ArrayList<String> card=new ArrayList<>();
    static {
        /*/
        定义点数，点数和类型确定用数组存储！
         */
        String[] size={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        /*/
        定义花色，类型确定使用数组！
         */

        String[] color={"♥","♦","♣","♠"};

        /*/
        大小王单独定义！
         */

        /*/
        采用循环为每个点数
        赋予四种花色
         */
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < color.length; j++) {
                String cards=size[i]+color[j];
                card.add(cards);
            }
        }

        card.add("大王");
        card.add("小王");
        System.out.println(card);
    }

    public static void main(String[] args) {
        System.out.println("-----牌组已经准备好了！-----");
    }
}
