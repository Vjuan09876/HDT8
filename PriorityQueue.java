public interface PriorityQueue<E extends Comparable<E>> {
    void add(E item);
    E remove();
    E peek();
    boolean isEmpty();
    int size();
}