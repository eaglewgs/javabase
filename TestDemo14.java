import java.util.Arrays;

/**
 * 将一个数组的元素偶数放到前面，奇数放到后面
 * 方法：l,r,前面遇到奇数停止，后面遇到偶数停止然后交换
 * @author wgsstart
 * @creat 2021-03-02 18:00
 */
public class TestDemo14 {
    public static void swap(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left<right){
            while(left<right && array[left] %2 == 0){//该行代码指left如果指的为偶数的情况
                left++;
            }
            //走到这儿有两种情况：1：不满足left<right 2:left所指遇到奇数了
            while(left<right && array[right] % 2!=0){//该行代码指right如果指的为奇数的情况
                right--;
            }
            //走到这儿有两种情况：1：不满足left<right 2:right所指遇到偶数了
            if(left<right){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,3,1,6,7};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
}
