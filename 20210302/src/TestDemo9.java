import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * @author wgsstart
 * @creat 2021-03-02 15:22
 */
public class TestDemo9 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};//[fromIndex,toIndex)左闭右开
        System.out.println(Arrays.binarySearch(array, 2, 5, 6));
    }
}
