package sort;

/** 冒泡排序
 * @Author: bwenjie
 * @Date: 2020/8/19
 */
public class BubbleSort {

    /**
     * 算法描述：相邻比较，两两交换，最大的冒出来
     * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；再比较第二个和第三个，最终最大的元素会放在数组最后
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     */
    public void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    CommonUtil.swap(array, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {2,1,5,6,4,9,7,8,3};
        bubbleSort.sort(array);
        CommonUtil.printArray(array);
    }

}
