package com.example.demo.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class NotSafeDemo {

    public static void main(String[] args) {
//        listNotSafe();
//        setNotSafe();
        mapNotSafe();
    }



    public   static   void  mapNotSafe(){
        Map<String,String> list= new HashMap<>();//  new ConcurrentHashMap<>();     // Collections.synchronizedList(new ArrayList<>());          //new Vector<>();new ArrayList<>();
        for (int i=1;i<=30;i++){
            new Thread(()->{list.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0,8));
                System.out.println(list+":");
            },String.valueOf(i)).start();
        }
    }
    public   static   void  listNotSafe(){
        List  list1=new ArrayList();
        List<String> list=  new CopyOnWriteArrayList<>();     // Collections.synchronizedList(new ArrayList<>());          //new Vector<>();new ArrayList<>();
        for (int i=1;i<=30;i++){
            new Thread(()->{list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list+":");
            },String.valueOf(i)).start();
        }
    }
    public   static   void  setNotSafe(){
        Set<String> list=  new CopyOnWriteArraySet<>(); //new HashSet<>() ;    // Collections.synchronizedList(new ArrayList<>());          //new Vector<>();new ArrayList<>();
        for (int i=1;i<=30;i++){
            new Thread(()->{list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list+":");
            },String.valueOf(i)).start();
        }
    }
}
