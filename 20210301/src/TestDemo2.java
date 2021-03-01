/**
 * @author wgsstart
 * @creat 2021-03-01 16:41
 */
public class TestDemo2 {
    public static int factor(int n){//该函数的功能是1！+2！+3！+......+n!同时表明不同函数间的调用
    int sum = 0;
    for(int i=1;i<=n;i++){
        sum+=fac(i);
    }
    return sum;
    }
    public static int fac(int num){//该函数的功能是求n!
        int ret = 1;
        for(int i = 1; i<= num;i++){
            ret*=i;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(factor(5));
    }
}
