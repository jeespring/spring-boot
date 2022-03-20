package com.jeespring.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Arrays;
import java.util.Collections;

public class Generator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/spring-boot", "root", "root")
                .globalConfig(builder -> {
                    builder.author("张朝阳") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .dateType(DateType.TIME_PACK)
                            .outputDir("d://mybatis-plus").commentDate("yyyy-MM-dd HH:mm:ss"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.jeespring.security") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "d://mybatis-plus")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(Arrays.asList("t_user")) // 设置需要生成的表名
                            .addTablePrefix("t_", "sys_","cms_","ums_")// 设置过滤表前缀
                            .entityBuilder().enableLombok() //启用lombok注解
                            .mapperBuilder().enableBaseResultMap().enableMapperAnnotation();  //启用lombok注解

                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
