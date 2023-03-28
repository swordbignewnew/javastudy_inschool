package al;

import java.util.Arrays;

/*/
给出以下问题的分而治之算法：
给定两个大小为m和n的已排序列表，
并允许单位时间访问每个列表的第i个元素。
给出一个时间复杂度为O(lg m + lgn) 的算法
计算两个列表的并集中的第k个最大元素。
 */
public class work_4 {
    /*/
    算法采用了分治的思想，
    将问题分解成较小的子问题，
    通过递归的方式求解。
    算法首先将两个数组的中间元素分别与k作比较，
    如果两个中间元素之和小于k，则说明所求的元素在两个数组的右半部分中，
    否则在左半部分中。通过递归求解，最终可以得到并集中第k个最大元素的值。
     */
        public static int findKthElement(int[] arr1, int[] arr2, int k) {
            int len1 = arr1.length;
            int len2 = arr2.length;
            int mid1 = len1 / 2;
            int mid2 = len2 / 2;
            //len1为零，说明值在arr2中
            if (len1 == 0) {
                return arr2[k];
            }
            //len2为零，说明值在arr1中
            if (len2 == 0) {
                return arr1[k];
            }
            //k为零，说明值在arr2，与arr1的最小值中
            if (k == 0) {
                return Math.min(arr1[0], arr2[0]);
            }

            if (mid1 + mid2 < k) {
                if (arr1[mid1] > arr2[mid2]) {
                    return findKthElement(arr1, Arrays.copyOfRange(arr2, mid2 + 1, len2), k - mid2 - 1);
                } else {
                    return findKthElement(Arrays.copyOfRange(arr1, mid1 + 1, len1), arr2, k - mid1 - 1);
                }
            } else {
                if (arr1[mid1] > arr2[mid2]) {
                    return findKthElement(Arrays.copyOfRange(arr1, 0, mid1), arr2, k);
                } else {
                    return findKthElement(arr1, Arrays.copyOfRange(arr2, 0, mid2), k);
                }
            }
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 7, 9};
            int[] arr2 = {2, 4, 6, 8, 10};
            int k = 6;
            int result = findKthElement(arr1, arr2, k - 1);
            System.out.println("第" + k + "大的元素是: " + result);
        }
}

