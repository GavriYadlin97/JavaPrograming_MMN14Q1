import java.util.ArrayList;
import java.util.Iterator;

public class SortedGroup <T extends Comparable<T>> {

    private ArrayList<T> list;

    public SortedGroup() {
        this.list = new ArrayList<>();
    }

    public void add(T itemToAdd) {
        if (this.list.isEmpty()) {
            this.list.add(itemToAdd);
            return;
        }
        for (int i = 0; i < list.size(); i++)
            if (this.list.get(i).compareTo(itemToAdd) > 0) {
                this.list.add(i, itemToAdd);
                return;
            }
        this.list.add(itemToAdd);
    }

    public int remove(T itemToRemove) {
        int removed = 0;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).compareTo(itemToRemove) == 0) {
                this.list.remove(i);
                removed++;
                i--;
            }
        }
        return removed;
    }

    public Iterator<T> iterator() {
        return this.list.iterator();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (T t : this.list)
            str.append(t.toString()).append("\n");
        return str.toString();
    }
}
