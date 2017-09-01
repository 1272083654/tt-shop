package com.qf.common;

import java.util.Random;

/**
 * @Author:HuangJianFang
 * @Description:
 * @Date:Created in 11:39 2017/9/1
 * @Modified By:
 */
public class RandomTest {
    /**
    * @Author: HuangJianFang
    * @Description:
    * @Date: 11:46 2017/9/1
    */
    public static void main(String[] args){
        int r = new Random().nextInt(20)+1;
        System.out.println(r);
    }
}
