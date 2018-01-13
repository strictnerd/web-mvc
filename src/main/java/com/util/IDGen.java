package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by clq on 2017/12/15.
 */
public class IDGen {
    //20171215215320032
    static AtomicInteger atomicInteger = new AtomicInteger(1);
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int i=0;i<1000;i++) {
                        System.out.println(getTime());
                    }
                }
            }).start();
        }
    }

    public static long getTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssS");
        long l = Long.parseLong(sdf.format(new Date())) + atomicInteger.incrementAndGet();
        return l;
    }

}
