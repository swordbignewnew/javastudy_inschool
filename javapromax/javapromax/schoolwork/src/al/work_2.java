package al;
/*/
实现优先队列
 */
import java.util.PriorityQueue;

public class work_2 {
    public static void main(String[] args) {
        // 创建一个优先队列，并指定比较器
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((a,b)->b-a);
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(7);
        priorityQueue.add(8);

        //大的数优先级高，先输出！
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
