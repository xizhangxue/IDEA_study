package com.xuexizhang.cunsumerquesion;

/**
 * @author xuexizhang
 * @Description:
 * @date: 2020-09-18 21:34
 * @version:
 */
public class Bread {
    private static int id;
    private String message;

    public static int getId() {
        return id;
    }

    public static void setId() {
        Bread.id++;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
