package com.example.demo.test;



interface Foo{

//    public void  sayHello();
    public   int  add(int  x,int  y);
    default int  mul(int x,int y){
        return x*y;
    }


}

class LambdaDemoTest {
    public static void main(String[] args) {

//        Foo  foo=()->{
//            System.out.println("Say  Hello");
//        };
//        foo.sayHello();
        Foo  foo=(int x,int y)->{
              System.out.println("x+y :");
              return x+y;
        };

        System.out.println("x+y :"+ foo.add(4,3));

        System.out.println("x+y :"+ foo.mul(4,3));

    }
}