/**
 * 数据结构学习方法：
 * 1：写代码
 * 2：画图理解
 * 3：造轮子
 * @author wgsstart
 * @creat 2021-03-04 10:41
 */
public class Test4 {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
       for(int i = 0; i < 10;i++){
           myArrayList1.add(i,i);
       }
       myArrayList1.display();
       myArrayList1.add(10,999);
       myArrayList1.display();
    }


}
