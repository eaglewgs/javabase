import java.util.Arrays;

/**
 * 打印二维数组
 * 行数:array.length
 * 列数：array[i].length(每行对应的列数)
 * @author wgsstart
 * @creat 2021-03-02 20:30
 */
public class Test2 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};//这是二行三列的数组
    /*    for(int i = 0;i<array.length;i++){//外行内列第一种打印方式
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
        //System.out.println(Arrays.deepToString(array));//Arrays.deepTostring二维数组的打印方法（第二种打印方式）
        for (int[] tmp:array) {//这是第三种用foreach循环打印二维数组的方式
            for (int x:tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
