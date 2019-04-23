package constans;

import java.util.Arrays;


public class SortConstans {
    public static final int[] arr = {2, 36, 5, 1, 7, 9, 5, 10, 4, 3};

    public static final int[] arr_debug = {6, 9, 4, 5};


    public static void printAfterSort(boolean isDebug) {
        if (isDebug) {
            Arrays.stream(arr_debug).forEach(System.out::println);
        } else {
            Arrays.stream(arr).forEach(System.out::println);
        }

    }
}
