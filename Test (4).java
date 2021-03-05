/**
 * 单链表的使用：
 * 单链表由节点组成
 * @author wgsstart
 * @creat 2021-03-04 16:24
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(12);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.addLast(16);
        myLinkedList.display();
        myLinkedList.clear();
        System.out.println("hhhhhhhhhhh");
       /* boolean flag = myLinkedList.contains(11);
        System.out.println(flag);
        System.out.println(myLinkedList.size())*/
      /* myLinkedList.display();
        System.out.println();
       myLinkedList.addIndex(0,12);
       myLinkedList.display();
        System.out.println();*/
    /*   myLinkedList.remove(12);
       myLinkedList.display();
       */
    /*myLinkedList.removeAllKey(12);
    myLinkedList.display();*/
    }
}

