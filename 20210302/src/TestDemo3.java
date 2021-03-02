import java.util.Arrays;

/**
 * 用Arrays将数组以字符串的形式进行输出
 * @author wgsstart
 * @creat 2021-03-02 10:42
 */
public class TestDemo3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
       String ret = Arrays.toString(array);//将数组以字符串的形式进行输出
        System.out.println(ret);
        int[] array1 = null;//array引用的是个空对象，相当于对数组进行了初始化，
        // 它不是0地址，就是null
        System.out.println(array1[0]);
    }
}
