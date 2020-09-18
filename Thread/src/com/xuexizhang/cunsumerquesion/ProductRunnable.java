package com.xuexizhang.cunsumerquesion;

/**
 * @author xuexizhang
 * @Description:
 * @date: 2020-09-18 22:07
 * @version:
 */
public class ProductRunnable implements Runnable{
    private ProductAndSell productAndSell;
    public ProductRunnable(ProductAndSell productAndSell){
        this.productAndSell = productAndSell;
    }

    @Override
    public void run() {
        while (true){
            productAndSell.product();
        }

    }
}
