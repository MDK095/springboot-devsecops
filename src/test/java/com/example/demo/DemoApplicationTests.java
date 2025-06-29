package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; // <-- IMPORT INDISPENSABLE

class DemoApplicationTests {

    @Test
    void additionTest() {
        int sum = 2 + 3;
        assertEquals(5, sum);
    }
}

