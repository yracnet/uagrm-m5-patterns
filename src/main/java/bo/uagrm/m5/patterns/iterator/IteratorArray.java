package bo.uagrm.m5.patterns.iterator;

public class IteratorArray<T> implements Iterator<T> {

    private int index = 0;
    private T[] list;

    public IteratorArray(T[] list) {
        this.list = list;
    }

    @Override
    public T next() {
        if (list.length > index) {
            return list[index++];
        } else {
            return null;
        }
    }

    @Override
    public boolean isDone() {
        return list.length <= index;
    }

}
