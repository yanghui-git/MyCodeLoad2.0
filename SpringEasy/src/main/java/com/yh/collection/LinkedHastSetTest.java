package com.yh.collection;

import java.util.*;

/**
 * https://www.cnblogs.com/wlrhnh/p/7256969.html
 * linkHashSet
 */
public class LinkedHastSetTest {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("golang");
        stringSet.add("java");
        stringSet.add("python");
        System.out.println(stringSet);

        //保证有序性
        stringSet = new LinkedHashSet<>();
        stringSet.add("golang");
        stringSet.add("java");
        stringSet.add("python");
        System.out.println(stringSet);

        //ArrayList
        List<Integer> list=new ArrayList<>();
    }


}
