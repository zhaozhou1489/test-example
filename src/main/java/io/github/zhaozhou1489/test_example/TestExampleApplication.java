package io.github.zhaozhou1489.test_example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"io.github.zhaozhou1489.test_example.*"})
@MapperScan(basePackages = "io.github.zhaozhou1489.test_example.mapper")
@SpringBootApplication
public class TestExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestExampleApplication.class, args);
    }

}
