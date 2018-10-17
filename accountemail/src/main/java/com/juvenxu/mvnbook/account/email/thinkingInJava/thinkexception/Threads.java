package com.juvenxu.mvnbook.account.email.thinkingInJava.thinkexception;

import com.alipay.antvip.common.thread.ThreadFactoryBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class Threads {
    public static ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("demo-thread-0").build();
    public static ExecutorService executorService = new ThreadPoolExecutor(4, 10, 0, TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque(20), threadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        List<Callable<String>> callables = new ArrayList<Callable<String>>();
       /* for ( int n = 0; n < 100; n++) {
            callables.add(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "demo";
                }
            });
        }*/
        try{
//            List<Future<String>> futures = executorService.invokeAll(callables);
            List<Future<String>> futures = new ArrayList<Future<String>>();
            for( int n = 0; n < 100; n++){
                  futures.add(executorService.submit(new Tasks()));
              }
            executorService.shutdown();
            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
        }catch (Exception e){
          e.printStackTrace();
          throw  new RuntimeException();
        }finally {
            executorService.shutdown();
        }


    }
}
