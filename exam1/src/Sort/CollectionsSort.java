package exam1Sort;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import exam1Reverse.Reverse;

public class CollectionsSort {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>(list);
        Collections.sort(newList);
        return newList;
    }
}
