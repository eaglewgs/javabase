/**
 * 函数也就是方法，函数的调用是要在栈上开辟内存的，给这个函数开辟栈帧
 * 递归：把一个大的问题化解为小的问题（前提是大的问题的处理方式和小的问题的处理方式是一样的）
 * 1：要调用自己本身
 * 2：要有一个趋向于终止的条件
 * 3：要能推导出递归的公式：这一部分是最重要的也是最难的
 * @author wgsstart
 * @creat 2021-03-01 17:38
 */
public class TestDemo5 {//以下就是递归，有递有归
    public static int fac(int n){//该方法实现求n的阶乘
        if(n == 1){
            return 1;
        }
        int tmp = n * fac(n-1);
        return tmp;
    }
    public static void func1(int n){//该方法实现打印出一个数的每位上的数字
        if(n>9){
            func1(n/10);
        }
        System.out.println(n%10);
    }
    public static int sum (int n){//该方法实现1+2+3+4+5
        if(n == 1){
            return 1;
        }
        return n+sum(n-1);
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和。例如，输入1729，则应该返回1+7+2+9，它的和是19
    public static int func(int n){
       if(n==0){
           return 0;
       }
       return  n % 10 + func(n/10);
    }
    //求斐波那契数列的第n项，这个递归是多路递归。一般情况下，不建议用递归实现斐波那契数列，效率不高，
    // 可以用迭代（也就是循环）
    public static int fabonaci1(int n){
        if(n==1||n==2){
            return 1;
        }
        return fabonaci1(n-1)+fabonaci1(n-2);
    }
    //可以尝试下面的迭代（循环）的方法(非递归实现)
    public static int fabonaci2(int n){
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i = 3;i<=n;i++){
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        System.out.println(fabonaci2(5));
    }
}
