import java.util.Arrays;

/**
 * 数组的拷贝方法
 * @author wgsstart
 * @creat 2021-03-02 12:07
 */
public class TestDemo6 {
    public static int[] copyArray(int[] array){//第一种拷贝方式for
        int[] tmp = new int[array.length];
        for(int i=0;i<array.length;i++){
            tmp[i] = array[i];
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        /*int[] ret = Arrays.copyOf(array,array.length-1);
        System.out.println(Arrays.toString(ret));第二种拷贝形式Arrays.copyOf*/
       /*int[] ret = new int[array.length];
       System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));第三种拷贝方式System.arraycopy*/
       int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));//第四种拷贝方式clone
    }
}
