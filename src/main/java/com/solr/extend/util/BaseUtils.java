package com.solr.extend.util;

import java.util.Random;
/**
 * Created by jack on 2018/3/3.
 */
public class BaseUtils {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        for(int i=0; i < 100; i++) {
            System.out.println(randNum(0,3));
        }
    }

    /**
     * 返回[min,max]区间范围内的随机数
     * @param min
     * @param max
     * @return
     */
    public static int randNum(int min,int max) {
        return rand.nextInt(max - min + 1) + min;
    }
}