import java.util.Arrays;

/**
 * 数组在java中可以作为方法的返回值
 * @author wgsstart
 * @creat 2021-03-02 11:08
 */
public class TestDemo4 {
    public static int[] func(int[] array){
        int[] tmp = new int[array.length];
        for(int i = 0; i< array.length;i++){
            tmp[i] = array[i]*2;
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));
    }
}
