/**
 * 数组：存放相同数据类型的集合。内存是连续的。c语言当中数组存放在栈上，java中数组存放在堆上。
 * 栈上的地址是拿不到的
 * 堆上的地址可以打印，但是不是真实的，它是经过hash处理的，
 * 地址是唯一的，所以也可以当做是真实的（来用）
 * @author wgsstart
 * @creat 2021-03-01 22:19
 */
public class TestDemo {
    public static void main1(String[] args) {
        //以下三种数组的表示方法，存放的内容都在堆上，只要new就肯定在堆上，第一种也在堆上
        int[] array = {1,2,3,4};
        int[] array2 = new int []{1,2,3,4};
        int[] array3 = new int[4];//此时数组中存放的不是像c语言中那样存放的随机值，而是0；
        System.out.println(array+" "+array2+" "+array3);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
      /*  int len = array.length;//属性
        System.out.println(len);*/
        for (int i = 0; i < array.length; i++) {//打印数组的方式一
            System.out.print(array[i]+" ");

        }
        System.out.println();
        for (int val:array) {//打印数组的方式二（foreach）
            System.out.print(val+" ");
        }

    }

}
