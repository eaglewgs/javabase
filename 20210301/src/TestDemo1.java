import java.util.Scanner;

/**
 * 方法：功能
 * 形式：public static 返回值 方法名（形参）{
 *     方法体；
 * }
 * 方法名：命名要采用小驼峰的形式。比如：maxNum
 * 为什么大多采用public static?因为main方法是public static的，所写的方法如果想要在main方法中
 * 调用，那么该方法也要为public static
 * 返回值：可有可无，具体看业务需求。如果有返回值，那么返回值的类型需要和方法的返回值类型匹配
 * 方法体：就是具体功能的实现
 * @author wgsstart
 * @creat 2021-03-01 15:52
 */
public class TestDemo1 {
    //求两个数的最大值
    public static int maxNum(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }
    //求三个数的最大值
    public static int maxNum1(int num1,int num2,int num3){
       // return (num1 > num2 ? num1 : num2)>num3 ? (num1 > num2 ? num1 : num2) : num3;这种方法是土方法
        return maxNum(maxNum(num1,num2),num3);//这表示方法可以被嵌套，重复使用
    }
    public static  int sum(int a,int b){
        return a+b;
    }


    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int ret = maxNum(n1,n2);
        int ret1 = maxNum1(n1,n2,n3);
        System.out.println(ret1);*/
       int a =10;
       int b = 20;
       int ret = sum(a,b);
        System.out.println(ret);
        int ret2 = sum(80,20);
        System.out.println(ret2);
    }
}
