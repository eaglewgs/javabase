/**
 * @author wgsstart
 * @creat 2021-03-06 14:40
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        //myLinkedList.display();
        myLinkedList.addLast(2);
        //myLinkedList.display();
       /* System.out.println(myLinkedList.contains(4));
        System.out.println(myLinkedList.size());*/
        myLinkedList.addIndex(0,2);
        myLinkedList.addIndex(6,2);
        myLinkedList.addIndex(3,2);
        //myLinkedList.display();
        //System.out.println(myLinkedList.remove(4));
       // myLinkedList.display();
        /*myLinkedList.removeAllKey(2);
        myLinkedList.display();*/
    }

}
