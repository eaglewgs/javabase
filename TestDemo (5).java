/**
 *
 * 如果想克隆自定义类型
 * 1.实现接口
 * 2.重写clone方法
 * @author wgsstart
 * @creat 2021-03-07 21:57
 * 为什么Cloneable这个接口是空接口呢？
 * 空接口也把它叫做标记接口，其实就是只要一个类实现了这个接口，那么就标记这个类，是可以进行clone的。
 */
class Money implements Cloneable {
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
class Person implements Cloneable{
    public int age;
    Money m = new Money();
    @Override//重写了父类的clone方法
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //1.克隆person
        Person p = (Person) super.clone();
        //2.克隆当前的money对象
        p.m = (Money) this.m.clone();
        return p;
    }
}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println("=========修改=========");
        person2.m.money = 99.9;
        System.out.println(person1.m.money);
    }
    public static void main2(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone() ;
        System.out.println(person1.age);
        System.out.println(person2.age);
        System.out.println("=========修改=========");
        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
}
