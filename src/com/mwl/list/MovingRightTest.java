package com.mwl.list;

/**
 * @author mawenlong
 * @date 2018/10/31
 */
public class MovingRightTest {

  public static void main(String[] args) {
    /**
     * 除法运算，结果都向0取整；位运算结果向下取整.
     * 对于正数来说位运算和除法结果是一样的，因为正数的向下取整也就是向0取整；
     * 而对于负数来说，向下取整要比向0取整小1.
     */
    int num = -10001;
    long temp = System.nanoTime();
    num = num / 2;
    System.out.println(num);
    System.out.println("除2花费时间：" + (System.nanoTime() - temp));
    num = -10001;
    temp = System.nanoTime();
//    为了与除法相等需要+1
    num = (num >> 1) + 1;
    System.out.println(num);
    System.out.println("除2花费时间：" + (System.nanoTime() - temp));

    System.out.println("int最大值+1：" + (Integer.MAX_VALUE + 1));

    int cap = Integer.MAX_VALUE - 9;
    int newCap = cap + (cap >> 1) + 1;
    System.out.println("newCap：" + newCap);
  }
}
