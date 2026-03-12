# Binary Tree Operations

Blueprints for hierarchical data structures, ranging from generic Binary Trees to sorted Search Trees.

## 🚀 Key Features
- **Standard Traversals**: Support for In-order, Pre-order, Post-order, and Level-order.
- **Search Constraints**: BST interface enforces $Left < Root < Right$ logic via `Comparable`.

## 📋 Performance Analysis


| Operation | Binary Tree | BST (Average) |
| :--- | :--- | :--- |
| **Insert** | $O(1)$ (leaf) | $O(\log n)$ |
| **Search** | $O(n)$ | $O(\log n)$ |
| **Delete** | $O(n)$ | $O(\log n)$ |
| **Space** | $O(n)$ | $O(n)$ |
