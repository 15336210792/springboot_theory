package com.zzh.config;

import com.zzh.bean.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackages = "com.itheima")
@Import(MyImportSelector.class)
public class SpringConfig6 {
}
