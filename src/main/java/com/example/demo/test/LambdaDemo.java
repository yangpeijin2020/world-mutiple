package com.example.demo.test;

import jdk.internal.util.xml.impl.ReaderUTF8;

import java.util.Arrays;
import java.util.Random;

public class LambdaDemo {


    public static void main(String[] args) {

        String  str="www.baidu.com";
        while (true){
            str+=str+new Random().nextInt(8888888)+new Random().nextInt(9999999);
        }






    }
}
