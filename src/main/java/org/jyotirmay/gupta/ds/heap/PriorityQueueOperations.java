package org.jyotirmay.gupta.ds.heap;

/**
 * A specialized collection that orders elements according to their natural
 * ordering or by a specified Comparator.
 *
 * <p>In a Min-Priority Queue, the element with the lowest value is served first.
 * In a Max-Priority Queue, the highest value is served first.</p>
 *
 * @param <E> the type of elements, must implement {@link Comparable}
 * @author Jyotirmay Gupta
 * @version 1.0
 */
public interface PriorityQueueOperations<E extends Comparable<E>> {

    /**
     * Inserts the specified element into the priority queue.
     * Performs a "sift-up" operation to maintain heap properties.
     *
     * @param element the element to add
     */
    void insert(E element);

    /**
     * Retrieves and removes the highest priority element (the root).
     * Performs a "sift-down" operation to restore balance.
     *
     * @return the prioritized element
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    E extractPriority();

    /**
     * Retrieves, but does not remove, the highest priority element.
     *
     * @return the element at the root
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    E peekPriority();

    /**
     * Changes the priority of an existing element.
     *
     * @param element the element to update
     * @param newPriority the new value to assign
     */
    void changePriority(E element, E newPriority);

    /**
     * Returns the number of elements in the heap.
     * @return current size
     */
    int size();

    /**
     * Checks if the queue is empty.
     * @return {@code true} if no elements exist
     */
    boolean isEmpty();

    /**
     * Removes all elements from the priority queue.
     */
    void clear();
}
