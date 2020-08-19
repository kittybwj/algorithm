package sort;

/** 插入排序
 * @Author: bwenjie
 * @Date: 2020/8/19
 */
public class InsertionSort {

    /**
     * 算法描述：前部分已排序，后部分未排序。取未排序部分的第一个向前依次比较，放到正确位置。
     * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     */
    public void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
               if (array[j] < array[j - 1]) {
                   CommonUtil.swap(array, j, j - 1);
               }
            }
        }
    }


    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {2,1,5,6,4,9,7,8,3};
        insertionSort.sort(array);
        CommonUtil.printArray(array);
    }
}
