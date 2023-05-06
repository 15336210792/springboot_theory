package com.zzh.bean;

import org.springframework.stereotype.Component;

//@Component("tom")  //tom就是原来的id
public class Cat {
    public Cat(){
    }

    int age;
    public Cat(int age){
        this.age = age;
    }

   @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
