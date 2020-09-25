package com.example.demo.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ticket {

    int  num=30;
    Lock lock=new ReentrantLock();
    public  void  sale(){
        lock.lock();
        try{
            if (num>0)
                System.out.println(Thread.currentThread().getName()+"\t  sold"+(num--)+"\t  还剩下"+num);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}


  class  SaleTicket{
    public static void main(String[] args) {
        Ticket  ticket=new Ticket();
        new Thread(()->{for(int  i=1;i<=40;i++)  ticket.sale();},"AAA").start();
        new Thread(()->{for(int  i=1;i<=40;i++)  ticket.sale();},"BBB").start();
        new Thread(()->{for(int  i=1;i<=40;i++)  ticket.sale();},"CCC").start();
    }
}