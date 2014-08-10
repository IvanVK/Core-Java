import static org.junit.Assert.assertEquals;
import maxScaler.maxScaler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
////////////////////////////////////////////////////

public class tests {
    private maxScaler ms;
    @Before
    public void setUp() throws Exception {
        ms = new maxScaler();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
       int [] a = {1};
       int [] b = {1};
       assertEquals(1, ms.maxScalarProduct(a, b));
    }
    @Test
    public void testWithZeroes() {
       int [] a = {1,0};
       int [] b = {0,1};
       assertEquals(1, ms.maxScalarProduct(a, b));
    }
   
    
    
    
    
}