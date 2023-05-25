package com.lakers.list;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.TreeMultiset;

import java.util.*;

/**
 * Created on 2023/5/24 18:29
 *
 * @author lakers
 */
public class ListTest {

    public static void main(String[] args) {
        arrayListTest();
        linkedHashSetTest();
        treeMultisetTest();
        treeSetTest();
        hashMultisetTest();
        hashSetTest();
    }

    /**
     * 按插入顺序排序,可重复
     */
    public static void arrayListTest() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(2);
        System.out.println(arrayList);
    }

    /**
     * 按插入顺序排序,不可重复
     */
    public static void linkedHashSetTest() {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);
    }

    /**
     * 按自然顺序排序,可重复
     */
    public static void treeMultisetTest() {
        TreeMultiset<Integer> treeMultiset = TreeMultiset.create();
        treeMultiset.add(1);
        treeMultiset.add(3);
        treeMultiset.add(2);
        treeMultiset.add(2);
        System.out.println(treeMultiset);
    }

    /**
     * 按自然顺序排序,不可重复
     */
    public static void treeSetTest() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(2);
        System.out.println(treeSet);
    }

    /**
     * 乱序,可重复
     */
    public static void hashMultisetTest() {
        HashMultiset<String> hashMultiset = HashMultiset.create();
        hashMultiset.add("zhouYu");
        hashMultiset.add("zhouJie");
        hashMultiset.add("zhouJieLun");
        hashMultiset.add("zhouYu");
        System.out.println(hashMultiset);
    }

    /**
     * 乱序,不可重复
     */
    public static void hashSetTest() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("zhouYu");
        hashSet.add("zhouJie");
        hashSet.add("zhouJieLun");
        hashSet.add("zhouYu");
        System.out.println(hashSet);
    }
}
