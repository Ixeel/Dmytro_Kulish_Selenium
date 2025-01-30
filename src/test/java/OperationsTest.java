import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OperationsTest {
    public Calculator calculator;

    @BeforeClass
    public void before_class() {
        calculator = new Calculator();
    }

    @Test(description = "Testing addition of elements", priority = 1)
    public void addTestCase() {
        Assert.assertEquals(calculator.add(5, 1),6);
        System.out.println("Addition result = "+calculator.add(5, 1));

    }

    @Test(description = "Testing subtraction of elements", priority = 2)
    public void substractTestCase() {
        Assert.assertEquals(calculator.subtract(5, 1),4);
        System.out.println("Substraction result = "+calculator.subtract(5, 1));
    }

    @Test(description = "Testing division of elements", priority = 3)
    public void divideTestCase() {
        Assert.assertEquals(calculator.divide(15, 5), 3);
        System.out.println("Division result = "+calculator.divide(15,5));
    }

    @Test(description = "Testing division by zero", expectedExceptions = ArithmeticException.class, priority = 4)
    public void divideByNullTestCase() {
        Calculator.divide(33,0);
    }

    @Test(description = "Testing multiplication of elements", priority = 5)
    public void multiplyTestCase() {
        Assert.assertEquals(calculator.multiply(13, 5),65);
        System.out.println("Multiplication result = "+calculator.multiply(13, 5));
    }

    @AfterClass
    public void after_class() {
        calculator = null;
    }
}