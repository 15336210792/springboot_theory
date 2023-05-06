package com.zzh.config;

import com.zzh.bean.DogFactoryBean;
import org.springframework.context.annotation.Import;

//@Import({Dog.class,DbConfig.class})
@Import(DogFactoryBean.class)
public class SpringConfig4 {

}
