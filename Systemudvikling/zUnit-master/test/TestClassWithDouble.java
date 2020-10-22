import zunit.TestSuite;

public class TestClassWithDouble extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClassWithDouble testClass = new TestClassWithDouble();
        testClass.runTestSuite();
    }
    private void passingTest(){
        // Ændres fra int til Strings
        assertEquals(3.5,4.3,1);
    }
    private void failingTest(){
        assertEquals(3.3, 4.5 ,2);
    }
}
