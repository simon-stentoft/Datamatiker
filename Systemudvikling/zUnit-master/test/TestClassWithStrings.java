/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/10/2020
 *
 */

import zunit.TestSuite;

public class TestClassWithStrings extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClassWithStrings testClass = new TestClassWithStrings();
        testClass.runTestSuite();
    }

    private void passingTest(){
        // Ændres fra int til Strings
        assertEquals(new String("string1"),new String ("string1"));
    }
    private void failingTest(){
        assertEquals(new String("string1"),new String ("string2"));
    }
}

