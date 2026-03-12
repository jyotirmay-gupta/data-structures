# AVL Tree Operations

The **AVL Tree** is the first dynamically self-balancing BST ever invented. It provides a more rigid balance than Red-Black Trees, making it faster for **search-intensive** applications.

## 🚀 Key Features
- **Strict Balance**: Ensures the height difference (Balance Factor) between subtrees is always $\in \{-1, 0, 1\}$.
- **Faster Lookups**: Because it is more strictly balanced, the average path to a leaf is shorter than in a Red-Black Tree.
- **Automatic Rotations**: Handles four types of rotations (LL, RR, LR, RL) to maintain structure.

## 📋 Performance Analysis


| Operation | Average Case | Worst Case |
| :--- | :--- | :--- |
| **Search** | $O(\log n)$ | $O(\log n)$ |
| **Insert** | $O(\log n)$ | $O(\log n)$ |
| **Delete** | $O(\log n)$ | $O(\log n)$ |

> **Note:** While search is faster, `insert` and `delete` might be slightly slower than Red-Black Trees due to more frequent rotations.

## 🛠 Usage Example
```java
AVLTree<Integer> avl = new MyAVLTree<>();
avl.insert(10);
avl.insert(20);
avl.insert(30); // Triggers a Left Rotation (RR case)

System.out.println("Tree is balanced: " + avl.isBalanced());
System.out.println("Root: " + avl.getRoot()); // Should be 20
