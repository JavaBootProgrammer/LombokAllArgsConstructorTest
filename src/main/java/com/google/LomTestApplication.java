package com.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.Car;
@SpringBootApplication
public class LomTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(LomTestApplication.class, args);
        Person p = new Person("A","B","C","8","F");
        System.out.println(p.toString());


    }

}
