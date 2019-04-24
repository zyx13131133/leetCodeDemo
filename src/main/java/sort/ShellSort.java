package sort;

/**
 * 希尔排序
 * 分组进行插入排序，最后再整体插入排序
 */
public class ShellSort implements Sort {

    @Override
    public void sort(int[] arr) {
        int i, j, r, temp;

        for (r = arr.length / 3; r >= 1; r = r / 3) {
            for (i = r; i < arr.length; i++) {
                temp = arr[i];
                j = i - r;
                //一轮排序
                while (j >= 0 && temp < arr[j]) {
                    arr[j + r] = arr[j];
                    j = j - r;
                }

                arr[j + r] = temp;

            }
        }
    }


}
