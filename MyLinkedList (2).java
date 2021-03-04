/**
 * this代表当前对象的引用。
 * 引用：属性/方法
 *  实例成员变量
 *  静态成员变量
 *  this()
 *  this.data
 *  this.func()
 * @author wgsstart
 * @creat 2021-03-04 17:09
 */
class Node{
    public int data;//两个属性默认值为0
    public Node next;//默认值null
    public Node(int data){//构造方法
        this.data = data;
        this.next = null;//先置为空，可以方便下面放在任意处，可以灵活。
    }
}
public class MyLinkedList {
    public Node head;//保存单链表的头节点的引用
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);//这一行代码之后，我们就已经有了这么一个节点了
        if(this.head == null){
            //第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //打印单链表
    public void display(){
        Node cur = this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null){//如果是第一次插入的话
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next!=null ){
            cur = cur.next;
        }
       cur.next = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur!=null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;
           while(cur!=null){
            count++;
            cur = cur.next;
       }
        return count;
    }
    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index == 0){//头插法
            addFirst(data);
            return;
        }
        if(index == this.size()){//尾插法
            addLast(data);
            return;
        }
        //先找到 index位置的前一个节点的地址
       Node cur =  searchIndex(index);
        //进行插入
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }
    private Node searchIndex(int index){
        //1.对index进行合法性检查
        if(index < 0||index > this.size()){
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;//index-1
       while(index-1 !=0){
           cur = cur.next;
           index--;
       }
       return cur;
    }
}
