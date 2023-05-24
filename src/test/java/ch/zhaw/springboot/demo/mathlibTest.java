package ch.zhaw.springboot.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class mathlibTest {
    
    @Test
    public void testIsEven1() {
        boolean result = mathlib.isEven(8);
        assertTrue(result);
    }

    @Test
    public void testIsEven2() {
        boolean result = mathlib.isEven(10);
        assertTrue(result);
    }

}
