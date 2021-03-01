/**
 * 青蛙跳台阶的问题
 * @author wgsstart
 * @creat 2021-03-01 21:43
 */
public class TestDemo7 {
    public static int JumpFloor(int target){
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(JumpFloor(3));
    }
}
