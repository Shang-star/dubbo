package com.shang;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shang
 * @PackageName:com.shang
 * @ClassName:Provider_8081
 * @Description:
 * @date 2021/3/19 18:24
 */
@SpringBootApplication
@EnableDubbo
public class Provider_8082 {
    public static void main(String[] args) {
        SpringApplication.run(Provider_8082.class,args);
    }
}
