package com.juvenxu.mvnbook.account.email.thinkingInJava.thinkexception;

import java.util.concurrent.Callable;

public  class Tasks implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "demo";
    }
}
