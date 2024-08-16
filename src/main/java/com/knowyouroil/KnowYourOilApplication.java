package com.knowyouroil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.knowyouroil.MeasureInterface.*;

@SpringBootApplication
public class KnowYourOilApplication {

    public static void main(String[] args) {
        SpringApplication.run(KnowYourOilApplication.class, args);
        MeasureInterface.init();
    }

}
