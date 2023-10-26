package bo.uagrm.m5.patterns.iterator;

import java.util.List;

public class IteratorCollection<T> implements Iterator<T> {

    private int index = 0;
    private List<T> list;

    public IteratorCollection(List<T> list) {
        this.list = list;
    }

    @Override
    public T next() {
        if (list.size() > index) {
            return list.get(index++);
        } else {
            return null;
        }
    }

    @Override
    public boolean isDone() {
        return list.size() <= index;
    }

}
