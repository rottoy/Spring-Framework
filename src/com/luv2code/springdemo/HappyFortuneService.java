package com.luv2code.springdemo;

import java.util.Random;
public class HappyFortuneService implements FortuneService{
    public String[] arr={"first","second","third"};

    private Random random = new Random();
    @Override
    public String getFortune() {
        int index=random.nextInt(arr.length);
        String theFortune=arr[index];
        return theFortune+" is a tough day!";
    }
}
