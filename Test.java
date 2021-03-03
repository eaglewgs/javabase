/**
 * 构造方法：他的方法名是和类名相同的，且没有返回值。
 * 提出问题：一个对象的产生，分为几步，它是如何产生的？
 *1：为对象分配内存
 * 2：调用合适的构造方法（意味着构造方法不止一个）
 *1.当没有提供构造方法的时候，那么编译器会自动提供一个不带有参数的构造方法。
 * 2.当你提供了构造方法，编译器就不会自动生成一个构造方法了
 * 构造方法的作用：是用来构造对象或者实例化对象的
 * 面试问题：this关键字代表当前对象，这句话对吗？不对的话为什么不对？
 * 因为看前面的笔记，对象的产生分为两步，当构造方法完了之后才会有对象，而是在构造方法里就用了，
 * 它是对象的引用（在第一步为对象分配完内存之后，用this来引用）
 * this的功能：
 * this:
 * this():调用自己的构造方法,只能在构造方法里面写，只能调用一个，因为它只能写在第一行
 * this.data:调用当前对象的属性
 * this.func():调用当前对象的方法
 * @author wgsstart
 * @creat 2021-03-03 15:48
 */class Person{
     private String name;
     private int age;
     public Person(){//构造方法1
         this("caocao",18);
         //this("zhangfei");这个和上面那个只能调用一个
         System.out.println("Person<init>");
     }
     public Person(String name,int age){//构造方法2
        this.name = name;
        this.age = age;
        System.out.println("Person<王根生>");
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(this.getName());
        System.out.println(this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        /*Person person2 = new Person("王根生",25);
        System.out.println(person1);
        System.out.println(person2);*/
    }
}
