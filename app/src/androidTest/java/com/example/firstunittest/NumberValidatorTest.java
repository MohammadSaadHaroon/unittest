package com.example.firstunittest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NumberValidatorTest {
    NumberValidator SUT;
    @Before
    public void setup(){
        SUT = new NumberValidator();
    }
@Test
    public  void NumberTest(){
        boolean result = SUT.isPostive(-1);
    Assert.assertThat(result,is(false));
}
    @Test
    public  void NumberTest2(){
        boolean result = SUT.isPostive(0);
        Assert.assertThat(result,is(false));
    }

    @Test
    public  void NumberTest3(){
        boolean result = SUT.isPostive(20);
        Assert.assertThat(result,is(true));
    }
}