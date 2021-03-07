package com.bit.demo3;


/**
 * 关于重写要注意的事项：
 * 1.需要重写的方法不能是被final修饰的，被final修饰之后，它是密封方法，不可以修改
 * 2.被重写的方法，访问修饰限定符一定不能是私有的
 * 3.被重写的方法，子类当中的访问修饰限定符要大于等于父类当中的访问修饰限定符。
 * 4.被static修饰的方法是不可以被重写的
 * 运行时绑定：父类引用子类对象，同时，通过父类引用调用同名的覆盖方法，此时就会发生运行时绑定
 * 发生向上转型的时机：
 * 1：直接赋值
 * 2：传参
 * 3：返回值
 * 注意：向下转型非常不安全，很少使用向下转型
 * 在构造方法当中可以触发动态绑定。
 * @author wgsstart
 * @creat 2021-03-07 11:58
 */
class Animal{
    protected String name;
    public Animal(String name){//构造方法
        this.name = name;
        System.out.println(this.name+"Animal(String)");
    }
    public void eat(){
        System.out.println(this.name+"Animal::eat()");
    }

}
class Cat extends Animal {
     public int count = 99;
    public Cat(String name){
        super(name);//显示调用父类的构造方法，而不是继承
        System.out.println("Cat(String)");
    }
    public void eat(){
        System.out.println(this.name + "的示范法Cat::eat()");
    }
    /* public String name;
     public void eat(){
         System.out.println(this.name+"Cat::eat()");
     }*/
}
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(this.name+"Bird::fly()");
    }
}
public class TestMain {
    public static void func(Animal animal){
        animal.eat();
    }
    public static Animal func(){

        return new Cat("咪咪");
    }
    public static void main(String[] args) {
      /*  Animal animal = new Cat("mimi");//向上转型，父类引用子类对象
        animal.eat();
        //animal.count;向上转型之后，通过父类的引用只能访问父类自己的方法或者属性
        */
      /*Cat cat = new Cat("mimi");
      func(cat);*/
      /*Animal animal = func();
      animal.eat();*/
     /* Animal animal = new Cat("咪咪");
      animal.eat();*/
     //向下转型（父类的引用赋值给子类）
     /*   Animal animal = new Bird("八哥");

        Bird bird = (Bird)animal;
        bird.fly();*/
    Animal animal = new Cat("八哥");
    //A instanceof B 判断A是不是B的一个实例
        if(animal instanceof Bird){
    Bird bird = (Bird)animal;
    bird.fly();
    }else{
            System.out.println("fasfagfah");
        }
    }
}


