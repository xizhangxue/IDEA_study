package com.xuexizhang.cunsumerquesion;

/**
 * @author xuexizhang
 * @Description:
 * @date: 2020-09-18 22:25
 * @version:
 */
public class ProductAndSellText {
    public ProductAndSellText() {
        ProductAndSell productAndSell = new ProductAndSell();

        ProductRunnable p1 = new ProductRunnable(productAndSell);
        ProductRunnable p2 = new ProductRunnable(productAndSell);
        ProductRunnable p3 = new ProductRunnable(productAndSell);

        CustomerRunnable c1 = new CustomerRunnable(productAndSell);
        CustomerRunnable c2 = new CustomerRunnable(productAndSell);
        CustomerRunnable c3 = new CustomerRunnable(productAndSell);
        CustomerRunnable c4 = new CustomerRunnable(productAndSell);
        CustomerRunnable c5 = new CustomerRunnable(productAndSell);
        CustomerRunnable c6 = new CustomerRunnable(productAndSell);

        Thread t1 = new Thread(p1, "师傅-1");
        Thread t2 = new Thread(p1, "师傅-2");
        Thread t3 = new Thread(p1, "师傅-3");

        Thread t4 = new Thread(c1, "消费者-1");
        Thread t5 = new Thread(c2, "消费者-2");
        Thread t6 = new Thread(c3, "消费者-3");
        Thread t7 = new Thread(c4, "消费者-4");
        Thread t8 = new Thread(c5, "消费者-5");
        Thread t9 = new Thread(c6, "消费者-6");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

    }

    public static void main(String[] args) {
        new ProductAndSellText();
    }

}
