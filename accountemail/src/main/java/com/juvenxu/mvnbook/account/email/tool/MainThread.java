package com.juvenxu.mvnbook.account.email.tool;

public class MainThread {
    public static void main(String[] args) {
        Thread t = new Thread(new BingFa());
        t.start();
        System.out.println("Waiting for liftOff！");
    }

}

