package sort;

/**
 * @Author: bwenjie
 * @Date: 2020/8/19 0019
 */
public class CommonUtil {

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
