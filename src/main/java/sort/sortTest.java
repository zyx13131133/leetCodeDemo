package sort;

import constans.SortConstans;

import java.lang.reflect.InvocationTargetException;

public class sortTest {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        SortFactory sortFactory = new SortFactory();
        sortFactory.sort(MergeSort.class, true);

    }
}
