/**
 *找数组当中的最大值
 * @author wgsstart
 * @creat 2021-03-02 14:19
 */
public class TestDemo7 {
    public static int maxArray(int[] array){
        int max = array[0];
        for(int i = 1;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {12,2,18,24,76,13};
       int ret = maxArray(array);
        System.out.println(ret);
    }
}
