package com.yang;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  /* 该应用程序入口的标志 */    // or use below instead
@EnableAdminServer      /* Spring boot admin */
//@ComponentScan    //组件扫描，自动发现和装配bean
//@Configuration    //使用Java文件配置，类似xml
//@EnableAutoConfiguration  //自动配置
public class MainApplication {
    /*@Bean
    public StartupRunner schedulerRunner() {
        return new StartupRunner();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
