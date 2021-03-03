/**
 * 封装：用private来修饰属性或者方法
 * 为什么要封装?
 * 如果没有特殊要求，类里的属性都设置为私有的，体现封装
 * this：当前对象的引用
 * 要习惯使用this(阿里巴巴的编程规范)
 * @author wgsstart
 * @creat 2021-03-03 12:23
 */
class Student{
    private String myName;//限定只能在类当中进行访问
    private int age;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /* //提供一个公开的接口，可以让外部类访问
    public String getMyName(){
        return this.MyName;
    }
    public void setMyName(String MyName){
       // MyName = MyName;局部变量优先相当于自己给自己赋值，并没有给属性中的MyName赋值，解决方法如下
        this.MyName = MyName;//
    }*/

    public void func1(){
        System.out.println("func1()");
    }
    public void show(){
        System.out.println("我叫" + this.myName + ",今年" + this.age + "岁");
    }

    @Override//注解:这个注解指的是这个方法是重新写的
    public String toString() {
        return "我的名字是"+ myName +","+
                "年龄是" + age +
                "岁";
    }
}
//以上是类的实现者写的代码
//如果类的实现者把类的属性代码改了，可能另外类的调用者都不知道，他更多关注类名，
// 所以这里将属性可以用到封装,一般类的实现者不会改变getMyname和setMyname方法名
//以下是类的调用者写的代码
public class TestLei4 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMyName("王根生");
        String str = student.getMyName();
        System.out.println(str);
        //student.show();
        System.out.println(student);


    }
}
