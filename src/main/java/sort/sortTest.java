package sort;

import constans.SortConstans;

public class sortTest {

    public static void main(String[] args) {
        //BubbleSort a = new BubbleSort();
        SelectionSort a = new SelectionSort();

        a.sort(SortConstans.arr);

        SortConstans.printAfterSort(false);
    }
}
