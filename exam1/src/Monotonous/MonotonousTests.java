package exam1Monotonous;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MonotonousTests {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void monotonousTest1() {
        assertEquals(true, Monotonous.isMonotonous(Arrays.asList(1,2,3,4,5,6)));
    }

    @Test
    public void monotonousTest2() {
        assertEquals(true, Monotonous.isMonotonous(Arrays.asList(6,5,4,3,2,1,1,1)));
    }
    @Test
    public void monotonousTest3() {
        assertEquals(false, Monotonous.isMonotonous(Arrays.asList(1,2,1,4,5,4)));
    }
}
