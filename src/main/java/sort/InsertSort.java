package sort;

/**
 * 插入排序 时间复杂度O(n^2)
 */
public class InsertSort implements Sort {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }

                arr[j + 1] = temp;
            }
        }
    }
}
