package com.shang;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shang
 * @PackageName:com.shang
 * @ClassName:Consumer_80
 * @Description:
 * @date 2021/3/19 20:04
 */
@SpringBootApplication
@EnableDubbo
public class Consumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_80.class,args);
    }
}
