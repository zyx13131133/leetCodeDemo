package sort;

/**
 * 快速排序 O（nlongn）
 * 1.选取基准值，以数组第一个元素为基准值
 * 2.从右向左找到比基准值小的数，从左向右找到比基准值大的数，两个数交换位置
 * 3.直到i == j ，此时一次排序完成，将基准值与这个数字进行位置交换
 * 4.递归从夫上面步骤
 *
 */
public class QuickSort implements Sort {

    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }


    private void sort(int[] arr, int start, int end) {

        int i, j, baseVal, temp;
        if (start > end) {
            return;
        }

        i = start;
        j = end;
        //baseVal就是基准位
        baseVal = arr[start];

        while (i < j) {
            //从右向左，找到比基准值小的数
            while (arr[j] >= baseVal && i < j) {
                j--;
            }
            //从左向右，找到比基准值大的数
            while (arr[i] <= baseVal && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[start] = arr[i];
        arr[i] = baseVal;
        //递归调用左半数组
        sort(arr, start, i - 1);
        //递归调用右半数组
        sort(arr, i + 1, end);

    }
}
