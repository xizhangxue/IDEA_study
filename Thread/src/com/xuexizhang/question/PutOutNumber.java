package com.xuexizhang.question;

/*
* 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 */

public class PutOutNumber {
    public static void main(String[] args){
        MyThread1 my1 = new MyThread1();
        //3.声明继承Runnable类的对像
        MyThread2 my2 = new MyThread2();
        //4.将对象作为参数传给Thread构造器，创建Thread的对象
        Thread t1 = new Thread(my2);
        my1.start();
        //5.start开始运行函数
        t1.start();
    }
}
//一个class文件只能有一个public类

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 */
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i < 100; i++ ){
            if(i%2==0){
                System.out.println( Thread.currentThread().getName()+ ":" + i);
            }
        }
    }
}

/*
 * 创建多线程的方式二：实现Runnable接口
         * 1. 创建一个实现了Runnable接口的类
         * 2. 实现类去实现Runnable中的抽象方法：run()
         * 3. 创建实现类的对象
         * 4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
         * 5. 通过Thread类的对象调用start()
         *
         *
         * 比较创建线程的两种方式。
         * 开发中：优先选择：实现Runnable接口的方式
         * 原因：1. 实现的方式没有类的单继承性的局限性
         *      2. 实现的方式更适合来处理多个线程有共享数据的情况。
         *
         * 联系：public class Thread implements Runnable
 * 相同点：两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
 */

//1.创建一个Thread类继承Ruanable
class MyThread2 implements Runnable{
    @Override
    //2.实现润fangfa
    public void run() {
        for(int i = 1; i < 100; i++ ){
            if(i%2 !=0){
                System.out.println( Thread.currentThread().getName()+ ":" + i);
            }
        }
    }
}