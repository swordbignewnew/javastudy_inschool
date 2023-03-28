package al;
/*/
实现快速排序并回答下列问题。
(1) Quicksort 对n 个元素都具有相同值的列表进行多少次比较？
(2) Quicksort 对n 个元素的列表最多和最少进行多少次比较，
分别给出最大和最小情况的实例。
 */


public class work_3 {
    public static void main(String[] args) {
        int[] a={5,66,7,9,8,2,42};
       sort(a);
    }

    private static void sort(int[] a) {
        int start=0;
        int end=a.length-1;
        System.out.println("排序前：");
        sortprint(a);
        quicksort(a,start,end);
        System.out.println("排序后：");
        sortprint(a);
    }

    private static void sortprint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    /*/
    算法，快速排序算法其实是冒泡排序的改良，
    对其来说，最慢的时候就是冒泡排序的时间复杂度，相当于
    每个数都要进行比较为，O(n^2)
    最好的情况是每次都能选择到中位数作为枢轴元素，
    这样每次划分都能将序列均匀地分成两个子序列，时间复杂度将达到最优，
    即O(n log n)。
    具体来说，在最好情况下，
    快速排序会将序列递归地分成两个长度大致相等的子序列，
    每次划分需要O(n)的时间复杂度，递归树的深度为O(log n)，
    因此总的时间复杂度为O(n log n)。
     */
    private static void quicksort(int[] a,int start,int end){
        if (start>=end){
            return;
        }
        int key=a[start];
        int i=start;
        int j=end;

        while (j>i){
             while (a[j]>key){
                j--;
            }
            while (a[i]<key){
                i++;
            }
            if (i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        quicksort(a,start,i-1);
        quicksort(a,i+1,end);
    }
}
