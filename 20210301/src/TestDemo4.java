import java.util.Scanner;

/**
 * 方法的重载：（overload）
 * 1:方法名相同
 * 2：返回值不作要求
 * 3：参数列表不同（参数的个数或者参数的类型不同）
 * 4：要在同一个类当中
 * 比如：下面的三个方法就构成方法的重载
 * @author wgsstart
 * @creat 2021-03-01 17:12
 */
public class TestDemo4 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ret = sum(1.0,2.0);
        System.out.println(ret);
    }
}
