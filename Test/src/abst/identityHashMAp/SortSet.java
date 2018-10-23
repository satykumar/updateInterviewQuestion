package abst.identityHashMAp;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {
    public static void main(String...a){
        Set<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
                  public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                  }

           });
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(treeSet);
    }
}
