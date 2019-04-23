package sort;


/**
 * 选择排序 时间复杂度O(n^2)
 */
public class SelectionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            if (index == i) {
                continue;
            } else {
                int temp;
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
