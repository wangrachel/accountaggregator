package com.juvenxu.mvnbook.account.email.tool;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for(int i=0; i < 5; i++){
            new Thread(new BingFa()).start();
            System.out.println("Waiting for liftOff！");
        }
    }
}
