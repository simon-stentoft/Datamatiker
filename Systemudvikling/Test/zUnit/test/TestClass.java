import zunit.TestSuite;

public class TestClass extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.runTestSuite();


    }
    private void passingTest(){
        assertEquals(5,5);
    }
    private void failingTest(){
        assertEquals(3,7);
    }
}
