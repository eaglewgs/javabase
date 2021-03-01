/**
 * 题目：打印出0~999999中的自幂数（三位自幂数称为水仙花数）abc=a*a*a+b*b*b+c*c*c
 * 等号左边和右边如果相等就是三位自幂数
 * 步骤：1：确定它是几位数 count
 *      2：求得每一位，然后进行运算
 *      3：和原来数字比较，如果相同，那么就是一个要求的结果
 * @author wgsstart
 * @creat 2021-03-01 11:33
 */
public class TestDemo10 {
    public static void main(String[] args) {
        for(int n = 1;n<=999999;n++){
            int count = 0;
            int tmp = n;//下面还要正常的用n,否则的话执行完下面的代码就变成0了
            while(tmp != 0){//这个while循环是判断n是几位数
                count++;
                tmp = tmp/10;
            }
            tmp = n;
            int sum = 0;
            while(tmp !=0){//这个while循环是求得n的每一位，然后每位按幂运算
                sum+=Math.pow(tmp%10,count);//比如：Math.pow(a,2)就是a*a
                tmp = tmp/10;
            }
            if(sum == n){//判断是否是自幂数
                System.out.println(sum+" is my result!");
            }

        }
    }
}
