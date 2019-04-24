package sort;

/**
 * 插入排序 时间复杂度O(n^2)
 */
public class InsertSort implements Sort {

    @Override
    public void sort(int[] arr) {
        insertSort(arr);
    }


    private void insertSort(int[] arr) {
        int i, j,temp;

        for (i = 1; i < arr.length; i++) {
            //假设第一个数已经排序好了,从第二个数开始
            j = i;

            temp = arr[i];

            while (j >= 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = temp;
        }


    }

}
