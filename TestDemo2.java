import java.util.Scanner;

/**
 * @author wgsstart
 * @creat 2021-02-28 21:28
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n <= 18){
            System.out.println("少年");
        }else if(n >=19 && n <= 28){
            System.out.println("青年");
        }else if(n >=29 && n <= 55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }
}
