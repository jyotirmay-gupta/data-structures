package org.jyotirmay.gupta.ds.tree;

/**
 * A specialized Binary Tree that maintains its elements in a sorted order.
 * For every node, all elements in the left subtree are smaller, and all
 * elements in the right subtree are larger.
 *
 * @param <E> the type of elements, must implement {@link Comparable}
 *
 * @author Jyotirmay Gupta
 * @version 1.0
 */
public interface BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {

    /**
     * Inserts a new element into the tree while maintaining the BST property.
     * @param element the value to insert
     */
    void insert(E element);

    /**
     * Removes the specified element from the tree.
     * @param element the value to remove
     * @return {@code true} if the element was found and removed
     */
    boolean delete(E element);

    /**
     * Searches for an element in the tree.
     * @param element the value to find
     * @return {@code true} if the element exists
     */
    boolean contains(E element);

    /**
     * Finds the minimum element in the tree (leftmost node).
     * @return the smallest element
     */
    E findMin();

    /**
     * Finds the maximum element in the tree (rightmost node).
     * @return the largest element
     */
    E findMax();
}
