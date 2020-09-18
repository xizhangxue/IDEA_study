package com.xuexizhang.cunsumerquesion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuexizhang
 * @Description:
 * @date: 2020-09-18 21:31
 * @version:
 */
public class ProductAndSell {
    private List<Bread> list = new ArrayList<>();

    /*
    生产面包方法
     */
    public synchronized void product(){
        notify();
        while (list.size() == 10){
            //面包师傅停止考面包
            System.out.println("当前面包个数： " +list.size()+"，"+Thread.currentThread().getName() + "停止烤面包");
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        Bread bread = new Bread();
        bread.setId();
        bread.setMessage("正在制作面包，其面包编号为"+bread.getId());
        list.add(bread);
        //当前哪个师傅制作好了面包
        System.out.println(Thread.currentThread().getName()+bread.getMessage() + "，面包个数为： " + list.size());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /*
    销售面包的方法
     */
    public synchronized void sell(){
        notify();
        while (list.size() == 0){
            //顾客停止买面包
            System.out.println("当前面包个数： " +list.size()+"，"+Thread.currentThread().getName() + "等待面包-----");
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        Bread bread =list.get(0);
        list.remove(bread);
        //哪个顾客买到了哪个面包
        System.out.println(Thread.currentThread().getName()+"买了面包"+bread.getId() + "，面包个数为： " + list.size());
        try {
            Thread.sleep(300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
