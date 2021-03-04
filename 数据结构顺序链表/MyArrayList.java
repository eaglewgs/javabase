import java.util.Arrays;

/**
 * @author wgsstart
 * @creat 2021-03-04 10:54
 */
public class MyArrayList {
    public int[] elem;//分配类型，成员变量，数组
    public int useSize;//有效的数据个数
    public static final int intCapacity = 10;//不常变的量，初始容量
    public MyArrayList(){//构造方法
        this.elem = new int[intCapacity];//初始化
        this.useSize = 0;
    }
    private boolean isFull(){//判断表里数据是否满了？
        if(this.useSize == this.elem.length){
            return true;
        }
        return false;
    }
    //在pose位置新增元素
    public void add(int pos,int data){//pose要加的下角标，data表示加入的数据
       if(isFull()){//如果满的话，就对当前的表进行扩容，在这儿进行二倍扩容
          this.elem = Arrays.copyOf(this.elem,2*this.elem.length);//这就是二倍扩容
       }
        if(pos<0||pos>this.useSize){
              return;
        }
        //挪数据了
        for(int i = this.useSize-1;i >=pos;i--){
            this.elem[i+1] = this.elem[i];
        }
        //在指定位置放数据了
        this.elem[pos] = data;
        this.useSize++;
    }
    //打印顺序表
    public void display(){
        for(int i = 0;i < this.useSize;i++){
            System.out.print(this.elem[i] + " ");

        }
        System.out.println();
    }
}
