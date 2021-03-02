/**
 * 判断一个数组是否是升序排序
 * @author wgsstart
 * @creat 2021-03-02 16:00
 */
public class TestDemo10 {
    public static boolean isUp(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        Boolean ret = isUp(array);
        System.out.println(ret);
    }
}
