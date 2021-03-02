/**
 * 找数组中对应元素的下标(顺序查找)
 * 二分查找（前提序列是有序的）
 * @author wgsstart
 * @creat 2021-03-02 14:34
 */
public class TestDemo8 {//顺序查找
    public static int find(int[] array,int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param array:代表序列
     * @param key：代表要查找的数字
     * @return
     */
    public static int binarySearch(int[] array,int key){//二分查找
           int left = 0;
           int right = array.length-1;
          while(left <= right){
              int mid = (left+right)/2;
              if(array[mid] < key){
                  left = mid + 1;
              }else if(array[mid]==key){
                 return mid;
              }else{
                  right = mid - 1;
              }
          }
          return -1;
    }
    public static void main(String[] args) {
        int[] array = {2,5,8,9,13};
        int ret = find(array,18);
        int ret1 = binarySearch(array,10);
        System.out.println(ret1);

    }
}
