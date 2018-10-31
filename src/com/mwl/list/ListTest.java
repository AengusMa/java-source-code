package com.mwl.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * @author mawenlong
 * @date 2018/10/30
 */
public class ListTest {

  private static final int LIST_SIZE = 100000;

  public static void main(String[] args) {
    testAdd();
    testGet();
  }

  private static void testGet() {
    Random random = new Random();
//    初始化
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    for (int i = 0; i < LIST_SIZE; i++) {
      linkedList.add(i);
    }
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    for (int i = 0; i < LIST_SIZE; i++) {
      arrayList.add(i);
    }

    long start = System.currentTimeMillis();
//  访问
    for (int i = 0; i < LIST_SIZE; i++) {
      int j = random.nextInt(i + 1);
      int k = linkedList.get(j);
    }

    long end = System.currentTimeMillis();
    System.out.println("linkedList访问:"+(end - start));
//  访问
    for (int i = 0; i < LIST_SIZE; i++) {
      int j = random.nextInt(i + 1);
      int k = arrayList.get(j);
    }

    System.out.println("arrayList访问:"+(System.currentTimeMillis() - end));
  }

  private static void testAdd() {

    long start = System.currentTimeMillis();

    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    for (int i = 0; i < LIST_SIZE; i++) {
      linkedList.add(0, i);
    }

    long end = System.currentTimeMillis();
    System.out.println("linkedList插入：" + (end - start));

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    for (int i = 0; i < LIST_SIZE; i++) {
      arrayList.add(0, i);
    }

    System.out.println("linkedList插入：" + (System.currentTimeMillis() - end));
  }
}
