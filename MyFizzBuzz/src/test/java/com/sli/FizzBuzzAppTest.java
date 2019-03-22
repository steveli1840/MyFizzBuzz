package com.sli;

import static com.sli.FizzbuzzApp.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzAppTest {

	@Test
    public void multiplesOf3_stage1() {
        assertThat(fizzBuzz1(9), is("Fizz"));
        assertThat(fizzBuzz1(12), is("Fizz"));
        assertThat(fizzBuzz1(18), is("Fizz"));
        assertThat(fizzBuzz1(21), is("Fizz"));
    }
	
	@Test
    public void multiplesOf5_stage1() {
        assertThat(fizzBuzz1(5), is("Buzz"));
        assertThat(fizzBuzz1(10), is("Buzz"));
        assertThat(fizzBuzz1(20), is("Buzz"));
        assertThat(fizzBuzz1(25), is("Buzz"));
    }
	
    @Test
    public void multiplesOf15_stage1() {
        assertThat(fizzBuzz1(15), is("FizzBuzz"));
        assertThat(fizzBuzz1(45), is("FizzBuzz"));
        assertThat(fizzBuzz1(60), is("FizzBuzz"));
        assertThat(fizzBuzz1(75), is("FizzBuzz"));
    }
	
    @Test
    public void others_stage1() {
        assertThat(fizzBuzz1(1), is("1"));
        assertThat(fizzBuzz1(7), is("7"));
        assertThat(fizzBuzz1(13), is("13"));
        assertThat(fizzBuzz1(31), is("31"));
    }
    
	@Test
    public void divBy3_or_with3_stage2() {
        assertThat(fizzBuzz2(3), is("Fizz"));
        assertThat(fizzBuzz2(13), is("Fizz"));
        assertThat(fizzBuzz2(23), is("Fizz"));
        assertThat(fizzBuzz2(39), is("Fizz"));
    }
	
	@Test
    public void divBy5_or_with5_stage2() {
        assertThat(fizzBuzz2(5), is("Buzz"));
        assertThat(fizzBuzz2(25), is("Buzz"));
        assertThat(fizzBuzz2(55), is("Buzz"));
        assertThat(fizzBuzz2(58), is("Buzz"));
    }

	@Test
    public void divBy3or5_or_with3or5_stage2() {
        assertThat(fizzBuzz2(15), is("Fizz Buzz FizzBuzz"));
        assertThat(fizzBuzz2(35), is("Fizz Buzz FizzBuzz"));
        assertThat(fizzBuzz2(45), is("Fizz Buzz FizzBuzz"));
        assertThat(fizzBuzz2(51), is("Fizz Buzz FizzBuzz"));
    }
    @Test
    public void others_stage2() {
        assertThat(fizzBuzz1(1), is("1"));
        assertThat(fizzBuzz1(17), is("17"));
        assertThat(fizzBuzz1(37), is("37"));
        assertThat(fizzBuzz1(41), is("41"));
    }
}
