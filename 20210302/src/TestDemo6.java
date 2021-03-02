import java.util.Arrays;

/**
 * 数组的拷贝方法
 * 这四种拷贝方式中System.arraycopy速度最快，因为它是偏低层的用的是c/c++
 * 深拷贝：将array1拷贝到array2,如果通过修改array2自己的元素，那么不会影响到array1,
 * 此时我们就叫做深拷贝。
 * 浅拷贝：与深拷贝相反
 * 这四种数组的拷贝方式，如果拷贝的是简单数据类型（比如int）则为深拷贝，如果拷贝的是引用
 * 数据类型（比如地址），则为浅拷贝。面试官如果问的话就回答浅拷贝，如果再反问你深点，就详细和他分情况
 * 说说。
 * 还有如何实现深拷贝，后面在接口的地方讲
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
       // System.out.println(Arrays.toString(ret));//第四种拷贝方式clone
        ret[0]=0;
        System.out.println(array[0]);
        System.out.println(ret[0]);

    }
}
