/**
 * 这个程序意味着实例化成员只要new一份就会有新的成员变量，而静态化成员变量只有一份
 * @author wgsstart
 * @creat 2021-03-03 10:41
 */
class Test{
    public int a;//实例化成员变量
    public static int count;//静态化成员变量
}
public class TestLei2 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a++;//1
        Test.count++;//1
        System.out.println(t1.a);
        System.out.println(Test.count);
        System.out.println("===================");
        Test t2 = new Test();
        t2.a++;//1
        Test.count++;//1
        System.out.println(t2.a);
        System.out.println(Test.count);
    }
}
