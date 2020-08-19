package sort;

/** 选择排序
 * @Author: bwenjie
 * @Date: 2020/8/19
 */
public class SelectionSort {

    /**
     * 算法描述：遍历找到最小的，放到最前面
     * 首先在未排序序列中找到最小元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列的末尾。
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     */
    public void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            CommonUtil.swap(array, min, i);
        }
    }


    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {2,1,5,6,4,9,7,8,3};
        selectionSort.sort(array);
        CommonUtil.printArray(array);
    }
}
