package org.jyotirmay.gupta.ds.tree;

/**
 * A self-balancing Binary Search Tree that uses an extra bit of storage per node
 * to represent its color (RED or BLACK).
 *
 * <p>This interface ensures that the tree remains balanced such that no path
 * from the root to a leaf is more than twice as long as any other,
 * guaranteeing O(log n) time for basic operations.</p>
 *
 * @param <E> the type of elements, must implement {@link Comparable}
 * @author Jyotirmay Gupta
 * @version 1.0
 */
public interface RedBlackTree<E extends Comparable<E>> extends BinarySearchTree<E> {

    /**
     * Enumeration representing the valid colors for a node in a Red-Black Tree.
     */
    enum Color { RED, BLACK }

    /**
     * Retrieves the color of the node containing the specified element.
     *
     * @param element the element to check
     * @return the {@link Color} of the node, or {@code null} if element not found
     */
    Color getColor(E element);

    /**
     * Performs a left rotation around the specified element.
     * While typically internal, this is exposed for visualization and testing of
     * the balancing mechanism.
     *
     * @param element the pivot element for rotation
     */
    void rotateLeft(E element);

    /**
     * Performs a right rotation around the specified element.
     *
     * @param element the pivot element for rotation
     */
    void rotateRight(E element);

    /**
     * Validates if the current tree strictly adheres to Red-Black properties:
     * 1. Every node is either red or black.
     * 2. The root is black.
     * 3. Every leaf (NIL) is black.
     * 4. If a node is red, both its children are black.
     * 5. Every path from a node to its descendant NIL nodes contains the
     *    same number of black nodes.
     *
     * @return {@code true} if all properties are satisfied
     */
    boolean isValidRedBlackTree();
}
