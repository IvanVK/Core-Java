package exam1Monotonous;

import java.util.List;
//import package.CollectionsSort;
//import package.Reverse;

public class Monotonous {
    public static boolean isMonotonous(List<Integer> list) {
        return CollectionsSort.sort(list).equals(list)
                || Reverse.reverse(CollectionsSort.sort(list)).equals(list);
    }
}