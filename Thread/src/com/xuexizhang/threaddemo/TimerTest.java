package com.xuexizhang.threaddemo;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author xuexizhang
 * @Description:
 * @date: 2020-09-19 21:31
 * @version: Timer TimerTask
 */
public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        //在多久后执行
        long delay = 1000;
        //定义执行的时间间隔
        long period = 5000;
        //任务和执行调度设置绑定
        timer.schedule(new Task("机器"),delay,period);
        //在1秒之后每五秒运行一下run
    }
}
class Task extends TimerTask{
    private String name;
    public Task(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name+ "在运行");
    }
}

