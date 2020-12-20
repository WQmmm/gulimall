package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  整合mybatis-plus
 *    1 导入依赖
 *    2 配置
 *       2.1 配置数据源
 *             2.1.1 导入数据库驱动
 *             2.1.2 在 application.yml 中配置数据源相关信息
 *       2.2  配置mybatis-plus
 *             2.2.1 使用 MapperScan
 *             2.2.2  告诉 mybatis-plus :  sql的映射文件
 */

@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
