package com.zzh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ImportResource({"applicationContext1.xml","applicationContext11.xml"})
public class SpringConfig32 {
}
