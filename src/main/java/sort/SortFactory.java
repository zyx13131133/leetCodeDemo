package sort;

import constans.SortConstans;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SortFactory {

    public void sort(Class clazz,boolean isDebug) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Method method = clazz.getMethod("sort",int[].class);

        if (isDebug){
            method.invoke(clazz.newInstance(),SortConstans.arr_debug);
            SortConstans.printAfterSort(true);
        }else {
            method.invoke(clazz.newInstance(),SortConstans.arr);
            SortConstans.printAfterSort(false);
        }



    }

}
