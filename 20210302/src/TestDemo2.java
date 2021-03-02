/**
 * 数组进行传参做一个交换变量元素的方法
 * @author wgsstart
 * @creat 2021-03-02 10:21
 */
public class TestDemo2 {
    public static void swap(int[] arr){
        int tmp = arr[0];
         arr[0] = arr[1];
         arr[1] = tmp;
    }
    public static void main(String[] args) {
        int[] array = {10,20};
        System.out.print(array[0]+" "+array[1]);
        System.out.println();
        swap(array);
        System.out.print(array[0]+" "+array[1]);

    }
}
