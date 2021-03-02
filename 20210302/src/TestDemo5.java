import java.util.Arrays;

/**
 * 写一个将整型数组转换成字符串的方法
 * @author wgsstart
 * @creat 2021-03-02 11:33
 */
public class TestDemo5 {
    public static String myToString(int[] array){
    String ret = "[";
    for(int i = 0;i<array.length;i++){
       ret+=array[i] ;
            if(i!=array.length-1){
                ret+=",";
            }
    }
    ret+="]";
    return ret;
    }
    public static void main(String[] args) {
        int[] array = {12,34,1,6,2,9,21};
        System.out.println(myToString(array));
    }
}
