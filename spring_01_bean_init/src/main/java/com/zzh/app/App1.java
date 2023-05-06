package com.zzh.app;

import com.alibaba.druid.pool.DruidDataSource;
import com.zzh.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Object cat = ctx.getBean("cat");
        // System.out.println(cat);
        Dog dog = ctx.getBean(Dog.class);
        // System.out.println(dog);
        String[] names = ctx.getBeanDefinitionNames();//拿到所有定义bean的名（id的名称）没有配置会自动给一个
        for (String name : names) {
            System.out.println(name);
        }

    }
}
