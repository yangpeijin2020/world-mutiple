package com.example.demo.test;

class  MyNumber{
    int  num=10;
    public  void  addTo12(){
        this.num=12;
    }
}


public class JMMTest {

    public static void main(String[] args) {
        MyNumber  myNumber=new MyNumber();
        new  Thread(() -> {
            System.out.println("**********************code   in");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myNumber.addTo12();
            System.out.println(Thread.currentThread().getName()+" A  update  number ,number  value is:"+myNumber.num);

        },"AAAA").start();
        new  Thread(() -> {
            System.out.println("**********************code   in");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" B  update  number ,number  value is:"+myNumber.num);

        },"BBB").start();

        while (myNumber.num==10){

        }

        System.out.println(Thread.currentThread().getName()+"mission  is  over");
    }




}
