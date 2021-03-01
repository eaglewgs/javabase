/**
 * 汉诺塔问题
 * pos1,pos2,pos3代表三个位置
 * @author wgsstart
 * @creat 2021-03-01 21:10
 */
public class TestDemo6 {
    public static void move (char pos1,char pos2){//代表从pos1挪到pos2
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n ,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);//此时pos1是起始位置，pos2是中途位置，pos3是终点位置
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);//此时起始位置是pos2,pos1是中途位置，pos3是终点位置
        }
    }
    public static void main(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');

    }
}
