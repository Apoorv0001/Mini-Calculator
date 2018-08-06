package com.example.minicalculator;

import com.udojava.evalex.Expression;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Some test 
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        String proessor = "SQRT(1+5+6^5)/8.4";
        System.out.println(new Expression(proessor).eval().toPlainString());
    }
}