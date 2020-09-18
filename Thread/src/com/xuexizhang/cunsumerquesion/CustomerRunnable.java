package com.xuexizhang.cunsumerquesion;

/**
 * @author xuexizhang
 * @Description:
 * @date: 2020-09-18 22:16
 * @version:
 */
public class CustomerRunnable implements Runnable{
    ProductAndSell productAndSell;
    public CustomerRunnable(ProductAndSell productAndSell){
        this.productAndSell = productAndSell;
    }
    @Override
    public void run() {
        while (true){
            productAndSell.sell();
        }

    }
}
