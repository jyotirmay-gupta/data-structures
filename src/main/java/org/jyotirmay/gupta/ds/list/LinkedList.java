package org.jyotirmay.gupta.ds.list;

/**
 * A linear collection of elements that supports efficient insertion and removal
 * at both ends. This interface defines the contract for a generic Doubly Linked List,
 * providing O(1) performance for head/tail operations and O(n) for positional access.
 *
 * <p>Implementing classes should ensure that null elements are handled according
 * to specific project requirements (typically allowed but documented).</p>
 *
 * @param <E> the type of elements held in this collection
 * @author Jyotirmay Gupta
 * @version 1.0
 */
public interface LinkedList<E> {

    // --- Positional Insertion ---

    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param element the element to add
     * @throws IllegalArgumentException if the specified element is null and
     *                                  the implementation does not permit null elements
     */
    void addFirst(E element);

    /**
     * Appends the specified element to the end of this list.
     *
     * @param element the element to add
     * @return {@code true} if the element was added successfully
     */
    boolean addLast(E element);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right.
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   ({@code index < 0 || index > size()})
     */
    void add(int index, E element);

    // --- Element Extraction ---

    /**
     * Retrieves and removes the first element of this list.
     *
     * @return the head of this list
     * @throws java.util.NoSuchElementException if this list is empty
     */
    E removeFirst();

    /**
     * Retrieves and removes the last element of this list.
     *
     * @return the tail of this list
     * @throws java.util.NoSuchElementException if this list is empty
     */
    E removeLast();

    /**
     * Removes the element at the specified position in this list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    E remove(int index);

    // --- Query Operations ---

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    E get(int index);

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     *
     * @param o element to search for
     * @return the index of the first matching element, or -1 if not found
     */
    int indexOf(Object o);

    /**
     * Returns {@code true} if this list contains the specified element.
     *
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     */
    boolean contains(Object o);

    // --- State Management ---

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    int size();

    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list is empty
     */
    boolean isEmpty();

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
    void clear();
}
