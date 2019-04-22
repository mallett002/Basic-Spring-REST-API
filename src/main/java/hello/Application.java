package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


/*
* @SpringBootApplication adds:
* 1- @Configuration: Tags class as source of bean definitions for app context
* 2- @EnableAutoConfiguration: Tells Spring Boot to add beans based on classpath settings
* 3- Flags application as web app
* 4- @ComponentScan tells Spring to look for other components, configs, and services in "hello" package
*       -So it can find controllers
*
* SpringApplication.run() launches an application
* */
