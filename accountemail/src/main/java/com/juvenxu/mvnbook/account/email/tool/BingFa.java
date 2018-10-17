package com.juvenxu.mvnbook.account.email.tool;

public class BingFa implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiffOff!") + ").";
    }

    //    public static void main(String[] args) {
//        new BingFa().run();
//    }

}
