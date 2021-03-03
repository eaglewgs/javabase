/**
 * 类和变量：
 *访问权限修饰限定符：
 * public:公有的
 * private:私有的
 * protected:受保护的
 * 什么都不写：默认权限->包访问权限，后面会讲
 * @author wgsstart
 * @creat 2021-03-02 21:56
 */
class Person{//在java中定义一个类
    //字段->成员变量:定义在方法外边，类的里边。
    //实例成员变量：在对象里面，new出来的堆上
    //实例成员变量没有初始化的情况下：引用类型默认为null,简单类型默认为0，char->'\u0000'
    //boolean->false
    public String name;//可以在这儿初始化，也可以不初始化，一般在这并不初始化，下面用到的时候再赋值
    public int age;
    public char ch;
    public boolean flag;
    //静态成员变量，不属于对象，不在堆上，它在方法区，属于类，那么如何访问静态成员变量？
    public static int size;//和实例成员变量是一样的，在这儿也可以不初始化，默认也是相应的，只有一份
    //方法->行为（没有加static的方法称为实例成员方法，下面两个就是实例成员方法）
    public void eat(){
        int a= 10;//在方法里定义的变量是局部变量,在栈里放着
        System.out.println("eat()!");
    }
    public void sleep(){
        System.out.println("sleep()");
    }
    public static void func1(){//静态成员方法,它的调用方法和静态成员变量类似，不需要new,只需要用类名
        System.out.println("static::func1()");
    }
    public void show(){
        System.out.println("我叫" + name + "今年" + age + "岁");
    }
}

public class TestLei1 {
    public static void main(String[] args) {
        //通过关键字new,可以实例化多个对象
        Person person1 = new Person();//person1这个变量存放的是在堆上new出的对象的地址，想要
        //想要拿到对象中的成员变量，只需要person1.成员变量
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
       /* //如何访问对象当中的实例成员变量？
        //操作符：点号（.） 对象引用.成员变量
        System.out.println(person1.age);
        System.out.println(person2.ch);
        System.out.println(person3.flag);
        System.out.println(person4.name);*/
      /*  //如何访问静态的成员变量？不用new对象，直接类名.静态成员变量
       // System.out.println(person1.size);这样打印是不行的，是会有警告的，要将person1
        //的变量换成类Person,如下
        System.out.println(Person.size);*/
     /* //实例成员方法如何调用？
        person1.eat();
        person2.sleep();
        //静态成员方法如何调用？用类名
        Person.func1();
*/
    person1.name = "王根生";
    person1.age = 25;
    person1.show();

    }
}
