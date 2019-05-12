package org.vistula.vistulamath;

import org.junit.Test;

public class VistulaMathTest {

    @Test
    public void shouldCorrectlyAdd() {
        assert VistulaMath.add(5, 6) == 11;
    }

    @Test
    public void shouldCorrectlyDivide(){
        assert VistulaMath.divide(10,2) ==5;
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowNewException() {
        VistulaMath.divide(10, 0);
    }
//
    @Test
    public void shouldCorrectlyMultiply() {
        assert VistulaMath.multiply(5, 6) == 30;
    }

}
