package com.promineo;

public class TestDemo {

    /**
     * Computes the sum of digits of a given integer.
     *
     * @param number The integer whose digits will be summed.
     * @return The sum of the digits.
     * @throws IllegalArgumentException if the number is negative.
     */
    public int sumOfDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative!");
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10; 
            number /= 10;       
        }
        return sum;
    }
}