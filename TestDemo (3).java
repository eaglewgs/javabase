package com.bit.demo1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 *继承的优点：可以达到代码的复用效果，子类继承父类除构造方法外所有的
 * 1.在java当中使用关键字extends只能继承一个类，对于父类的private的字段和方法，
 * 子类中是无法访问的，并不是没有被继承
 * 2.子类在构造的时候，要先帮助父类进行构造。
 * super关键字：
 * 面试问题：请说出this关键字和super关键字的区别？
 * this:当前对象的引用
 * 1:this();//调用本类其他的构造方法
 * 2：this.data;//访问当前类当中的属性
 * 3：this.func();//调用本类的其他的成员方法
 * super:代表父类对象的引用
 * 1.super();//调用父类的构造方法
 * 2.super.data();//访问父类的属性
 * 3.super.func();//访问父类的成员方法
 * @author wgsstart
 * @creat 2021-03-06 20:25
 */class Animal{
     protected String name;
     public Animal(String name){//构造方法
         this.name = name;
         System.out.println("Animal(String)");
     }
     public void eat(){
         System.out.println(this.name+"Animal::eat()");
     }
     private void sleep(){
         System.out.println("Animal::sleep()");
     }
}
class Cat extends Animal{
     public Cat(String name){
         super(name);//显示调用父类的构造方法，而不是继承
         System.out.println("Cat(String)");
     }
    /* public String name;
     public void eat(){
         System.out.println(this.name+"Cat::eat()");
     }*/
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public void fly(){
         System.out.println(this.name+"Bird::fly()");
     }
        }

public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("mimi");
        cat.name = "mimi";
        cat.eat();
        Bird bird = new Bird("八哥");
        bird.fly();
        bird.eat();

    }
}
