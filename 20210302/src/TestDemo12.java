import java.util.Arrays;

/**
 * 优化后的冒泡排序：在上一个冒泡排序基础上，每一趟完成后都去看看是否已经有序了，
 * 如果在某一趟已经有序了，那么就不需要剩下的趟数了
 * @author wgsstart
 * @creat 2021-03-02 16:49
 */
public class TestDemo12 {
    public static void bubbleSort(int[] array){
        boolean flag = false;
        for(int i = 0;i< array.length-1;i++){
            flag = false;
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(flag == false){//在原有冒泡排序的基础上增加了用boolean来判断哪一趟就已经排好序了，
                //那么就把它给结束，以此提高排序效率
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {23,13,437,78,90,46};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
