package com.zzh.config;


import com.zzh.bean.MyPostProcessor;
import com.zzh.bean.MyRegistrar;
import com.zzh.bean.MyRegistrar2;
import com.zzh.bean.service.impl.BookServiceImpl1;
import org.springframework.context.annotation.Import;

@Import({BookServiceImpl1.class, MyPostProcessor.class, MyRegistrar2.class, MyRegistrar.class})
public class SpringConfig8 {
}
