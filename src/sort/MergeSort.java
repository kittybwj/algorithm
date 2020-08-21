package sort;

/** 归并排序
 * @Author: bwenjie
 * @Date: 2020/8/20
 */
public class MergeSort {
    /**
     * 算法描述：该算法是采用分治法,两边分别排序，再开辟空间合并。
     * 1、把长度为n的输入序列分成两个长度为n/2的子序列；2、对这两个子序列分别采用归并排序；3、将两个排序好的子序列合并成一个最终的排序序列。
     * 时间复杂度：O(nlogn）
     * 空间复杂度：O(n)
     * 稳定性：稳定
     */
    public void sort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        int middle = (left + right) >> 1;
        sort(array, left, middle);
        sort(array,middle + 1, right);
        merge(array, left, middle, right);
    }

    public void merge(int[] array, int left, int middle, int right) {
        // 中间数组
        int[] tmp = new int[right - left + 1];
        // 左边序列开始标记
        int i = left;
        // 右边序列开始标记
        int j = middle + 1;
        // 中间序列开始标记
        int k = 0;
        while (i <= middle && j <= right) {
            tmp[k++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        while (i <= middle) {
            tmp[k++] = array[i++];
        }
        while (j <= right) {
            tmp[k++] = array[j++];
        }
        for (int p = 0; p < tmp.length; p++) {
            array[left + p] = tmp[p];
        }
        // 也可以用 System.arraycopy(a, start1, b, start2, length)
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {2,1,5,6,4,9,7,8,3};
        mergeSort.sort(array, 0, array.length - 1);
        CommonUtil.printArray(array);
    }
}
