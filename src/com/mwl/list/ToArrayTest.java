package com.mwl.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mawenlong
 * @date 2018/10/31
 */
public class ToArrayTest {

  public static void main(String[] args) {
    final int ARRAY_SIZE = 7;
    List<String> list = new ArrayList<String>();
    list.add("aaaaa");
    list.add("bbbbb");
    list.add("ccccc");
    /**
     * String[] tt = (String[]) list.toArray();
     * 这样是错的,因为list.toArray()的返回值为Object[]不能转为String[]
     */
    String[] a = new String[ARRAY_SIZE];
    for (int i = 0; i < ARRAY_SIZE; i++) {
      a[i] ="原始"+i;
    }
    String[] b = (String[]) list.toArray(a);

    for (int i = 0; i < ARRAY_SIZE; i++) {
      System.out.println("a:" + a[i] + "\tb:" + b[i]);
    }
    System.out.println(a.length);
    System.out.println(a.length);
  }
}
