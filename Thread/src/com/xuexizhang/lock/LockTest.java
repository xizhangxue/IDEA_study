package com.xuexizhang.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xuexizhang
 * @Description:
 * @date: 2020-09-19 19:46
 * @version: 同步锁Lock
 */
public class LockTest {
    public static void main(String[] args) {
        LockDome lockDome = new LockDome();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lockDome.add();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                lockDome.add();
            }
        }).start();
    }
}
class LockDome{
    Lock lock = new ReentrantLock();
    void add(){
        //加锁
        lock.lock();
        try {
            System.out.println(Thread.currentThread()+"获取锁成功");
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread()+"释放锁");
            //释放锁
            lock.unlock();
        }
    }
}
