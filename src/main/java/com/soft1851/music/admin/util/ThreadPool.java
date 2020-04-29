package com.soft1851.music.admin.util;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * 描述:
 *
 * @author：Guorc
 * @create 2020-04-29 8:24
 */
public class ThreadPool {
    /**
     * 异步线程
     */
    private final static ThreadPoolExecutor executor =
            new ThreadPoolExecutor(20, 100, 10, TimeUnit.MINUTES,
                    new ArrayBlockingQueue<>(2000),
                    r -> new Thread(r, "excelExportThread"),
                    new ThreadPoolExecutor.AbortPolicy());

    public static ThreadPoolExecutor getExecutor() {
        return executor;
    }
}
