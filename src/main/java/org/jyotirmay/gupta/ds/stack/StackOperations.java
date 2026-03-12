package org.jyotirmay.gupta.ds.stack;

/**
 * A linear collection that follows the Last-In-First-Out (LIFO) principle.
 * This interface provides a standard contract for stack-based data structures,
 * supporting constant-time O(1) operations for insertion and extraction.
 *
 * <p>Common use cases include expression evaluation, backtracking algorithms,
 * and undo/redo functionality.</p>
 *
 * @param <E> the type of elements held in this stack
 * @author Jyotirmay Gupta
 * @version 1.0
 */
public interface StackOperations<E> {

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the element to be pushed onto this stack
     * @return the {@code item} argument for method chaining
     * @throws IllegalArgumentException if the specified item is null and
     *         the implementation does not permit nulls
     */
    E push(E item);

    /**
     * Removes the object at the top of this stack and returns it.
     *
     * @return the element at the top of this stack
     * @throws java.util.EmptyStackException if this stack is empty
     */
    E pop();

    /**
     * Looks at the object at the top of this stack without removing it.
     *
     * @return the element at the top of this stack
     * @throws java.util.EmptyStackException if this stack is empty
     */
    E peek();

    /**
     * Returns the 1-based position where an object is on this stack.
     * If the object occurs as an item in this stack, this method returns the
     * distance from the top of the stack; the topmost item is at distance 1.
     *
     * @param o the desired object
     * @return the 1-based position from the top of the stack where the object
     *         is located; the return value -1 indicates that the object is not on the stack.
     */
    int search(Object o);

    /**
     * Returns the number of elements currently in the stack.
     *
     * @return the number of elements
     */
    int size();

    /**
     * Tests if this stack is empty.
     *
     * @return {@code true} if and only if this stack contains no items;
     *         {@code false} otherwise.
     */
    boolean isEmpty();

    /**
     * Removes all elements from the stack.
     */
    void clear();
}
