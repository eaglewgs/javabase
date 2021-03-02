/**
 * 数组进行参数传递做一个打印数组的方法
 * @author wgsstart
 * @creat 2021-03-02 10:03
 */
public class TestDemo1 {
    public static  void printArray(int[] arr){
        for (int x:arr) {
            System.out.println(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        printArray(array);
    }
}

