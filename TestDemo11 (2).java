import java.util.Arrays;

/**
 * 冒泡排序
 * 外层循环是趟数，内层循环是每趟的次数
 * @author wgsstart
 * @creat 2021-03-02 16:21
 */
public class TestDemo11 {
    public static void bubbleSort(int[] array){
        for(int i = 0;i< array.length-1;i++){
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {23,13,437,78,90,46};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
