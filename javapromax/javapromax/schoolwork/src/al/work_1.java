package al;

/*/
设计并实现一个 Θ(nlgn) 时间算法，
给定一个包含 n 个整数的集合 S 和另一个整数 x，
确定 S 中是否存在两个元素之和恰好为 x。
 */
public class work_1 {
/*/
归并排序的时间复杂度稳定为
Θ(nlgn) ，故使用归并排序
 */
public static void main(String[] args) {
    //测试数据
    int A[] = { 2,3,5,4,1,7,8,6 };
    // 排序前
    System.out.println("排序前：");
    for (int a : A) {
        System.out.print(a + " ");
    }
    System.out.println();
    // 排序
    mergeSort(A);
    // 排序后
    System.out.println("排序后：");
    for (int a : A) {
            System.out.print(a + " ");
    }
    System.out.println("");
    int x=15;
    System.out.println("判断结果为：");
    System.out.println(getscore(A, x));
}

/*/
判断S中是否存在两个元素之和恰好为 x。
 */
    private static boolean getscore(int[] a,int sorce) {
        int start=0;
        int end=a.length-1;
        while (true) {
            if(a[start]+a[end]==sorce){
                return true;
            }
            else if (a[start]+a[end]>sorce){
                end--;
            }
            else if (a[start]+a[end]<sorce){
                start++;
            }
            if (start>=end){
                return false;
            }
        }
    }

    // 排序入口
    public static void mergeSort(int[] A) {
        sort(A, 0, A.length - 1);
    }

    //递归
    public static void sort(int[] A, int start, int end) {
        if (start >= end)
            return;
        // 找出中间索引
        int mid = (start + end) / 2;
        // 对左边数组进行递归
        sort(A, start, mid);
        // 对右边数组进行递归
        sort(A, mid + 1, end);
        // 合并
        merge(A, start, mid, end);

    }

    // 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
    public static void merge(int[] A, int start, int mid, int end) {
        int[] temp = new int[A.length];// 临时数组
        int k = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            // 从两个数组中取出较小的放入临时数组
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (i <= mid) {
            temp[k++] = A[i++];
        }
        while (j <= end) {
            temp[k++] = A[j++];
        }
        // 将临时数组中的内容拷贝回原数组中 （left-right范围的内容）
        for (int m = 0; m < k; m++) {
            A[m + start] = temp[m];
        }
    }
}