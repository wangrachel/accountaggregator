package com.juvenxu.mvnbook.account.email.thinkingInJava.thinkexception;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

    public static class Tasker implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "hello";
        }

    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<Future<String>>();
        Future<String> res = null;
        for (int i = 0; i < 5; i++) {
            res = threadPool.submit(new Tasker());
            futures.add(res);
        }
        threadPool.shutdown();
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
    }

}

