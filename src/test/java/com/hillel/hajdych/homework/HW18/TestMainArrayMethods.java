package com.hillel.hajdych.homework.HW18;

import org.junit.jupiter.api.Test;

import static com.hillel.hajdych.homework.HW18.MainArrayMethods.avgArray;
import static com.hillel.hajdych.homework.HW18.MainArrayMethods.sqrtMatrix;
import static org.junit.jupiter.api.Assertions.*;

public class TestMainArrayMethods {

    int[] exampleArray1 = null;
    int[] exampleArray2 = {};
    int[] exampleArray3 = {1, 2, 3, 4};
    int[][] exampleArrayMatrix1 = null;
    int[][] exampleArrayMatrix2 = {};
    int[][] exampleArrayMatrix3 = {
            {1, 5},
            {5, 8}
    };
    int[][] exampleArrayMatrix4 = {
            {1, 5},
            {5, 8},
            {2, 9}
    };



    @Test
    void testAvgArrayForNull(){
        assertEquals(-2, avgArray(exampleArray1));

    }

    @Test
    void testAvgArrayForEmpty(){
        assertEquals(-1, avgArray(exampleArray2));
    }
    @Test
    void testAvgArrayForGood(){
        assertEquals(2.5, avgArray(exampleArray3));
    }
    @Test
    void testSqrtMatrixForNull(){
        assertEquals(-2, sqrtMatrix(exampleArrayMatrix1));
    }

    @Test
    void testSqrtMatrixForEmpty(){
        assertEquals(-1, sqrtMatrix(exampleArrayMatrix2));
    }
    @Test
    void testSqrtMatrixForTrue(){
        assertTrue(1 == sqrtMatrix(exampleArrayMatrix3));
    }

    @Test
    void testSqrtMatrixForFalse(){
        assertFalse(-1 == sqrtMatrix(exampleArrayMatrix4));
    }
}
