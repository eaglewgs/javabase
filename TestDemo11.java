import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * 编写代码模拟三次密码输入的场景。最多能输入三次密码，密码正确，提示“登陆成功”，
 * 密码错误，可以重新输入，最多输入三次，三次均错，则提示退出程序。
 * @author wgsstart
 * @creat 2021-03-01 12:38
 */
public class TestDemo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 3;
        while(count !=0){
            System.out.println("请输入你的密码： ");
            String password = scan.nextLine();
            if(password.equals("123456")){
                System.out.println("密码正确，登陆成功！");
                break;
            }else{
                count--;
                if(count!=0) {
                    System.out.println("你还有" + count + "次机会！");
                }
                else{
                    System.out.println("退出程序");
                }
            }
        }
    }
}
