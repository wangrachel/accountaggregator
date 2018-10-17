package main.java.com.juvenxu.mvnbook.account.email.thinkingInJava.thinkexception;

import com.alipay.antvip.common.thread.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xiedongliao
 * @version : create in 2018/2/2 14:12
 * @description
 */
public class ScanTableHelper {

    /** 扫表线程池 */
    public static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("ScanTableThread").build();
    public static ExecutorService executor = new ThreadPoolExecutor(4, 30,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue(200), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());


    /** 扫表的表总数 */
    public static final int          SCANNER_TABLE_TOTAL                 = 100;

    /** 扫表的数据库总数 */
    public static final int          SCANNER_DB_TOTAL                 = 10;
}
