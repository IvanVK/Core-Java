package exam1Reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>(list);
        Collections.reverse(newList);
        return newList;
    }


//public static void main(String[] args) {
//    Reverse rev = new Reverse();
//    List<Integer> list = new ArrayList();
//    for(int i = 0; i < 10; i++)
//        list.add(i);
//    System.out.println(rev.reverse(list));
//}
}