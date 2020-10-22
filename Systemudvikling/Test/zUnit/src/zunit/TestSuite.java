package zunit;

public abstract class TestSuite {
    private int passed; //private - kun klassen kan se det
    private int failed;

    public void runTestSuite() {
        passed = 0;
        failed = 0;

        testMethodList();
        System.out.println("Test passed: " + passed);
        System.out.println("Test failed: " + failed);
    }
    public abstract void testMethodList();

    public void assertEquals(int expected, int actual) {
        if (expected == actual) {
            passed++;
        }
        else {
            failed++;
            System.out.println("Test " + (passed + failed) + " has failed. \nExpected result: " + expected + "\nActual result: " + actual);

        }
    }
}


