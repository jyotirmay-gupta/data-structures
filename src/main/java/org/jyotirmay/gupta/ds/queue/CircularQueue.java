package org.jyotirmay.gupta.ds.queue;

/**
 * A specialized Queue implementation that utilizes a fixed-size buffer as if it were
 * connected end-to-end. This structure, known as a Ring Buffer, avoids the "false overflow"
 * of linear queues by reusing vacated slots at the beginning of the buffer.
 *
 * <p>This interface extends {@link Queue}, providing standard FIFO
 * behavior with additional metadata for capacity-constrained environments.</p>
 *
 * @param <E> the type of elements held in this circular queue
 * @author Jyotirmay Gupta
 * @version 1.o
 */
public interface CircularQueue<E> extends Queue<E>{

    /**
     * Retrieves the most recently added item in the queue without removing it.
     * This provides a "tail-peek" capability unique to circular structures.
     *
     * @return the element at the rear of the queue, or {@code null} if empty
     */
    E peekRear();

    /**
     * Checks if the queue has reached its maximum defined capacity.
     * In a circular queue, this typically occurs when {@code (rear + 1) % capacity == front}.
     *
     * @return {@code true} if no more elements can be added without dequeuing
     */
    boolean isFull();

    /**
     * Returns the total number of slots allocated for this queue.
     * Unlike {@link #size()}, this represents the hard limit of the buffer.
     *
     * @return the fixed capacity of the circular buffer
     */
    int capacity();

    /**
     * Returns the number of empty slots currently available in the buffer.
     *
     * @return {@code capacity() - size()}
     */
    default int remainingCapacity() {
        return capacity() - size();
    }
}
