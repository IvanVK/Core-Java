package exam1Monotonous;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import exam1Reverse.Reverse;

public class CollectionsSort {
    public static List<Integer> sort(List<Integer> List) {
        List<Integer> newList = new ArrayList<Integer>(List);
        Collections.sort(newList);
        return newList;
    }
}
