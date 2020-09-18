package com.xuexizhang.threaddemo;

/**
 * @author xuexizhang
 * @Description:
 * @date: 2020-09-18 20:10
 * @version:
 */
public class StringOutput {
    private OutWriter outwriter = new OutWriter();

    public static void main(String[] args) {
        new StringOutput();
    }

    public StringOutput(){
        //构造函数new Thread(Runnable ,Threadname);
        Thread t1 = new Thread(new OutputRunnable("1"),"小明");
        Thread t2 = new Thread(new OutputRunnable("2"),"小花");
        t1.start();
        t2.start();
    }

    class OutputRunnable implements Runnable{

        private String s;

        public OutputRunnable(String s){
            this.s = s;
        }
        @Override
        public void run() {
            //outwriter是线程共享的资源对象
            synchronized (outwriter){
                outwriter.print(s);
            }
        }
    }

    class OutWriter{
        // public synchronized void print(String s){
        public void print(String s){
            String tName = Thread.currentThread().getName();
            System.out.print(tName+"说 :");
            int len = s.length();
            for(int i =0;i < len;i++){
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }

    }

}
