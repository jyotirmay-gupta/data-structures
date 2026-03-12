package org.jyotirmay.gupta.ds.tree;

/**
 * A hierarchical collection of nodes where each node has at most two children.
 * This interface defines the structural contract for a basic Binary Tree.
 *
 * @param <E> the type of elements held in this tree
 * @author Jyotirmay Gupta
 * @version 1.0
 */
public interface BinaryTreeOperations<E> {

    /**
     * Returns the root element of the tree.
     * @return the root element, or {@code null} if empty
     */
    E getRoot();

    /**
     * Performs an In-order traversal (Left, Root, Right).
     * Typically used to retrieve elements in non-decreasing order in BSTs.
     * @return a list of elements in in-order sequence
     */
    java.util.List<E> traverseInOrder();

    /**
     * Performs a Pre-order traversal (Root, Left, Right).
     * Useful for creating a copy of the tree.
     * @return a list of elements in pre-order sequence
     */
    java.util.List<E> traversePreOrder();

    /**
     * Performs a Post-order traversal (Left, Right, Root).
     * Useful for deleting trees or evaluating postfix expressions.
     * @return a list of elements in post-order sequence
     */
    java.util.List<E> traversePostOrder();

    /**
     * Performs a Level-order (Breadth-First) traversal.
     * @return a list of elements level by level
     */
    java.util.List<E> traverseLevelOrder();

    /**
     * Returns the height of the tree.
     * @return the number of edges on the longest path from root to leaf
     */
    int height();

    /**
     * Returns the total number of nodes in the tree.
     * @return node count
     */
    int size();

    /**
     * Removes all nodes from the tree.
     */
    void clear();
}
