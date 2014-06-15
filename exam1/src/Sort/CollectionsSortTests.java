package exam1Sort;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CollectionsSortTests {

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
        List<Integer> list = new ArrayList<>(Arrays.asList(2,1,5,3,4));
        assertEquals(Arrays.asList(1,2,3,4,5), CollectionsSort.sort(list));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,1,5,3,4,7));
        assertEquals(Arrays.asList(1,2,3,4,5,7), CollectionsSort.sort(list2));
    }
    
}