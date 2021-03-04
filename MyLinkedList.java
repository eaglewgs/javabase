/**
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
}
