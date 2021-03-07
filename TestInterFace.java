package com.demo3;

/**
 * 接口（interface）
 * 1.接口当中的方法都是抽象方法
 * 2.其实可以有具体实现的方法。这个方法是被default来进行修饰的（JDK1.8加入的特性）
 * 3.接口当中定义的成员变量默认是常量
 * 4.接口当中的成员变量默认是：public static final
 * 成员方法是：public abstract
 * 5.接口是不可以被用来实例化的
 * 6.接口和类之间的关系：implements
 * 7.为了解决java单继承的问题，可以实现多个接口，后面会讲
 * 8.只要这个类实现了该接口，那么你就可以进行向上转型了。
 * @author wgsstart
 * @creat 2021-03-07 18:58
 */
interface Shape{
     int a = 10;
      void draw();
    default  void func(){
        System.out.println("fafalfj");
    }
}
public class TestInterFace {
    public static void main(String[] args) {

    }
}
