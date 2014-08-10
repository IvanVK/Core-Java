package exam1Reverse;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseTests {

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void testSort()
    {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        assertEquals(Arrays.asList(7, 6, 5, 4, 3, 2, 1), Reverse.reverse(list1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,2,1,7,8,3));
        assertEquals(Arrays.asList(3,8,7,1,2,5,4), Reverse.reverse(list2));
    }
    
}