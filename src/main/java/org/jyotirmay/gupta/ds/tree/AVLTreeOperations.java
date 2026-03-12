package org.jyotirmay.gupta.ds.tree;

/**
 * A strictly self-balancing Binary Search Tree (BST).
 *
 * <p>In an AVL tree, the heights of the two child subtrees of any node differ
 * by at most one; if at any time they differ by more than one, rebalancing
 * (rotations) is performed to restore this property.</p>
 *
 * @param <E> the type of elements, must implement {@link Comparable}
 * @author Jyotirmay Gupta
 * @version 1.0
 */
public interface AVLTreeOperations<E extends Comparable<E>> extends BinarySearchTreeOperations<E> {

    /**
     * Calculates the balance factor of a node.
     * Balance Factor = height(left_subtree) - height(right_subtree).
     *
     * @param element the element to check
     * @return the balance factor; should be -1, 0, or 1 in a balanced tree
     */
    int getBalanceFactor(E element);

    /**
     * Forces a rebalance of the tree starting from the specified node up to the root.
     * This is typically called internally after insertion or deletion.
     *
     * @param element the starting point for the balance check
     */
    void rebalance(E element);

    /**
     * Performs a Right-Left (RL) double rotation.
     * @param element the pivot node
     */
    void rotateRightLeft(E element);

    /**
     * Performs a Left-Right (LR) double rotation.
     * @param element the pivot node
     */
    void rotateLeftRight(E element);

    /**
     * Validates if the tree satisfies the AVL balance property for every node.
     * @return {@code true} if |height(left) - height(right)| <= 1 for all nodes
     */
    boolean isBalanced();
}
