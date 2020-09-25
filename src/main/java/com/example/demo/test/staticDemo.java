package com.example.demo.test;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.Arrays;

class CodeZy{

    public CodeZy() {
        System.out.println("CodeZy  构造方法");
    }

    static {
        System.out.println("code  静态代码块");
    }
    {
        System.out.println("code  普通方法");
    }
}


public class staticDemo {
    {
        System.out.println("*****************");
    }

    public staticDemo() {

        System.out.println("主类构造方法");
    }

    public static void main(String[] args)
    {
        System.out.println("main ===========");
        new CodeZy();
        System.out.println("************************");
        new staticDemo();
    }
    static {
        System.out.println("static==========");
    }
}
