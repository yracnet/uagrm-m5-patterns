package bo.uagrm.m5.patterns.iterator;

public interface Iterator<T> {

    T next();

    boolean isDone();
}
