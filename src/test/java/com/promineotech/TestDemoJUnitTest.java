package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.promineo.TestDemo;

public class TestDemoJUnitTest {

    private TestDemo testDemo;

    @BeforeEach
    void setUp() {
        testDemo = new TestDemo();
    }

    @Test
    void assertThatSumOfDigitsIsCorrect() {
        assertThat(testDemo.sumOfDigits(123)).isEqualTo(6);   
        assertThat(testDemo.sumOfDigits(405)).isEqualTo(9);   
        assertThat(testDemo.sumOfDigits(1001)).isEqualTo(2);  
        assertThat(testDemo.sumOfDigits(999)).isEqualTo(27);  
        assertThat(testDemo.sumOfDigits(0)).isEqualTo(0);     
    }

    @Test
    void assertThatSumOfDigitsThrowsExceptionForNegativeInput() {
        assertThatThrownBy(() -> testDemo.sumOfDigits(-5))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Number must be non-negative!");
    }
}