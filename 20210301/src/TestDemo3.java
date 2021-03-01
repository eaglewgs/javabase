import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 形参与实参的关系
 * 这是交换不可以的，具体的可以学到后面的类和对象以及数组可以实现，形参和实参只传递值，
 但是它们是不同的变量
 * @author wgsstart
 * @creat 2021-03-01 16:56
 */
public class TestDemo3 {
    public static void swap(int x, int y){
        int tmp = x;
        x = y;
        y = tmp;
    }
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        swap(a,b);
        System.out.println(a+" "+b);
    }


}
