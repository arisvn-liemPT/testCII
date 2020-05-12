package testcii;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mockit.Tested;
import testcii.Compute;

public class ComputeTest {

    /** {@link AgreementController}. */
    @Tested
    private Compute compute;

    @Test
    public void plus() {
        assertEquals(4, compute.plus(2, 2));
        assertEquals(2, compute.plus(2, 0));
    }

    @Test
    public void subtract() {
        assertEquals(4, compute.subtract(4, 0));
        assertEquals(1, compute.subtract(2, 1));
    }

    @Test
    public void subtract1() {
        assertEquals(4, compute.subtract(4, 0));
        assertEquals(1, compute.subtract(2, 1));
    }

    @Test
    public void subtract2() {
        assertEquals(4, compute.subtract(4, 0));
        assertEquals(1, compute.subtract(2, 1));
    }

    @Test
    public void subtract3() {
        assertEquals(4, compute.subtract(4, 0));
        assertEquals(1, compute.subtract(2, 1));
    }

    @Test
    public void subtract4() {
        assertEquals(4, compute.subtract(4, 0));
        assertEquals(1, compute.subtract(2, 1));
    }
}