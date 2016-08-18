package com.toysforshots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pradeep on 06-06-2016.
 */
/*@SpringBootApplication
@ComponentScan("com.toysforshots")*/
/*@Configuration
@ComponentScan("com.toysforshots.controller")
@EnableAutoConfiguration*/
public class InternationalizationApp {

    public static void main(String[] args) {
        SpringApplication.run(InternationalizationApp.class, args);
    }
}
