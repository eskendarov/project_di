package ru.job4j.di.annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "ru.job4j.di.annotation")
@PropertySource(value = "classpath:application.properties ")
public class Config {

    @Bean
    @Primary
    @Order(15)
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    @Order(4)
    public Dog getDog() {
        return new Dog("Dog");
    }

    @Bean
    @Order(37)
    public Dog someDog() {
        return new Dog("Dog");
    }
}
