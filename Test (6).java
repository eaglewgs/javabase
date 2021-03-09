import java.util.Arrays;

/**
 *
 * @author wgsstart
 * @creat 2021-03-09 12:09
 */
public class Test {
    public static void main(String[] args) {

    }
    public static void main8(String[] args) {
        String str2 = new String("hello").intern();
        String str1 = "hello";

        System.out.println(str1 == str2);
    }
    public static void main7(String[] args) {
        String str1 = null;
        String str2  = new String("hello");
        System.out.println(str2.equals(str1));

    }
    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);//比较的是引用，就是str1和str2这两个变量里面的值
        System.out.println(str1.equals(str2));//比较的是字符串中的内容
        String str3 = "hello";
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
    public static void func(String str,char[] array){
        str = "abcdef";
        array[0] = 'g';
    }
    public static void main5(String[] args) {
        String str1 = "hello";
        char[] val = {'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
    }
    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        str1 = "abc";
        System.out.println(str1);
        System.out.println(str2);
    }
    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "hel"+"lo";//常量在编译的时候就已经确定了
        System.out.println(str1 == str2);
        String str3 = new String("hel")+"lo";
        System.out.println(str3 == str1);
    }
    public static void main2(String[] args) {

    }
    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
        String str2 = "abcdef";
        System.out.println(str2);
        char[] val = {'a','b','c'};
        String str3 = new String(val);
        System.out.println(str3);
    }
}
