package com.jeespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.jeespring.mapper")
public class MapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperApplication.class, args);
    }

}
