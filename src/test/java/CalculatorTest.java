import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAddTwoIntegers(){
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void canSubtractTwoIntegers(){
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    public void canMultiplyTwoIntegers(){
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void canDivideTwoDoubles(){
        assertEquals(1.5, calculator.divide(3, 2), 0.001);
    }
}
