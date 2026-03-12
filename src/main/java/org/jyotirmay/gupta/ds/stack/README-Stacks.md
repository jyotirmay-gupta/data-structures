# Stack Operations

A specialized interface for **Last-In-First-Out (LIFO)** data structures, typically used for undo buffers or expression evaluation.

## 🚀 Key Features
- **Restricted Access**: Operations are limited to the "top" of the stack.
- **Constant Time**: Core mutations are strictly $O(1)$.

## 📋 Method Summary


| Method | Description | Complexity |
| :--- | :--- | :--- |
| `push(E)` | Adds an item to the top of the stack. | $O(1)$ |
| `pop()` | Removes and returns the top item. | $O(1)$ |
| `peek()` | Returns the top item without removing it. | $O(1)$ |
| `size()` | Returns the number of items. | $O(1)$ |
| `isEmpty()` | Returns `true` if the stack has no items. | $O(1)$ |
