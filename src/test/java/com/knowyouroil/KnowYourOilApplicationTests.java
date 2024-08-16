package com.knowyouroil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KnowYourOilApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void OilMeasure_MeasuresCorrectly(){
        OilAmtCalculator measure = new OilAmtCalculator();

        double result = measure.calculate(1000,25);
        Assertions.assertEquals(40.0, result);
    }

}
