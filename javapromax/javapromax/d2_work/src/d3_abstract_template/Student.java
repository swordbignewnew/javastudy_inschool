package d3_abstract_template;
/*/
模板方法，在实际生活中，有时候一个类的开头结尾都是固定的
只有中间正文需要改变，例如写作文。我们可以将正文变为一个抽象
方法，每个对象可以重写自己的正文
 */
public abstract class Student {
    public final void write(){
        System.out.println("\t\t\t<<my cat>>");
        System.out.println("i have a cat!");
        /*/
        中间正文用抽象类进行重写
         */
        System.out.println(writemain());
        System.out.println("i like it very mach");
    }

    public abstract String writemain();
}
