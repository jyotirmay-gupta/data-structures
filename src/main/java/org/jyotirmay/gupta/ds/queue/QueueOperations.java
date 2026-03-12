package org.jyotirmay.gupta.ds.queue;

/**
 * A linear collection designed for holding elements prior to processing.
 * Besides basic collection operations, queues provide additional insertion,
 * extraction, and inspection operations following the First-In-First-Out (FIFO) principle.
 *
 * <p>Queues typically, but do not necessarily, order elements in a FIFO manner.
 * Head of the queue is that element which has been on the queue the longest time.</p>
 *
 * @param <E> the type of elements held in this queue
 * @author Jyotirmay Gupta
 * @version 1.0
 */
public interface QueueOperations<E> {

    // --- Insertion ---

    /**
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions.
     *
     * @param e the element to add
     * @return {@code true} if the element was added to this queue
     * @throws IllegalStateException if the element cannot be added at this
     *         time due to capacity restrictions
     * @throws NullPointerException if the specified element is null
     */
    boolean add(E e);

    /**
     * Inserts the specified element into this queue if it is possible to do
     * so immediately without violating capacity restrictions.
     *
     * @param e the element to add
     * @return {@code true} if the element was added to this queue, else {@code false}
     */
    boolean offer(E e);

    // --- Removal ---

    /**
     * Retrieves and removes the head of this queue. This method differs
     * from {@link #poll poll} only in that it throws an exception if this
     * queue is empty.
     *
     * @return the head of this queue
     * @throws java.util.NoSuchElementException if this queue is empty
     */
    E remove();

    /**
     * Retrieves and removes the head of this queue, or returns {@code null}
     * if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    E poll();

    // --- Inspection ---

    /**
     * Retrieves, but does not remove, the head of this queue. This method
     * differs from {@link #peek peek} only in that it throws an exception
     * if this queue is empty.
     *
     * @return the head of this queue
     * @throws java.util.NoSuchElementException if this queue is empty
     */
    E element();

    /**
     * Retrieves, but does not remove, the head of this queue, or returns
     * {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    E peek();

    // --- Utility ---

    /**
     * Returns the number of elements in this queue.
     *
     * @return the number of elements
     */
    int size();

    /**
     * Returns {@code true} if this queue contains no elements.
     *
     * @return {@code true} if empty
     */
    boolean isEmpty();
}
