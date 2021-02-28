import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字：
 * @author wgsstart
 * @creat 2021-02-08 18:34
 */

public class TestDemo {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100);//[0~100)左闭右开
        while(true){
            System.out.println("请输入你要猜的数字: ");
            int num = scan.nextInt();
            if(num < randNum){
                System.out.println("你猜的数字小了！");
            }else if(num==randNum){
                System.out.println("恭喜你，猜对了！");
                break;
            }else{
                System.out.println("你猜的数字大了！");
            }
        }

    }
}
