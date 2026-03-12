# RedBlackTree Interface

The **Red-Black Tree** provides a self-balancing mechanism that guarantees $O(\log n)$ performance.

## 🚀 Key Features
- **Red-Black Tree**: Uses color properties to ensure height is within $2 \log n$.
- **AVL Tree**: Stricter balance; ensures height difference between subtrees $\leq 1$.

## 📋 Comparison Summary


| Feature | Red-Black Tree | AVL Tree |
| :--- | :--- | :--- |
| **Balance Type** | Loose ($O(\log n)$) | Strict ($O(\log n)$) |
| **Rotations** | Fewer (better for writes) | Frequent (better for reads) |
| **Typical Use** | `java.util.TreeMap` | Database indices |
