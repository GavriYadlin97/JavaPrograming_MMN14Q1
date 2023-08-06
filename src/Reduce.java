import java.util.Iterator;

public class Reduce {
    public static <T extends Comparable<T>> SortedGroup<T> reduce(T item, SortedGroup<T> sGroup) {
        SortedGroup<T> newGroup = new SortedGroup<>();
        Iterator<T> itr = sGroup.iterator();
        while (itr.hasNext()) {
            T current = itr.next();
            if (current.compareTo(item) > 0)
                newGroup.add(current);
        }
        return newGroup;
    }
}
