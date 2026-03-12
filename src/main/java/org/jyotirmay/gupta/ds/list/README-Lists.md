# LinkedList Interface

A high-performance, generic **Linked List** contract for Java applications. This interface defines the standard behaviors for a linear collection that requires efficient insertions and deletions at both the head and tail.

## 🚀 Key Features
* **Generic Support**: Type-safe implementation using Java Generics (`<E>`).
* **Double-Ended**: Optimized for both Stack (LIFO) and Queue (FIFO) operations.
* **Industry Documented**: Complete Javadoc support for IDE integration.

## 📋 Interface Methods

| Category | Methods | Complexity |
| :--- | :--- | :--- |
| **Insertion** | `addFirst(E)`, `addLast(E)`, `add(int, E)` | $O(1)$ to $O(n)$ |
| **Deletion** | `removeFirst()`, `removeLast()`, `remove(int)` | $O(1)$ to $O(n)$ |
| **Search** | `get(int)`, `indexOf(Object)`, `contains(Object)` | $O(n)$ |
| **Metadata** | `size()`, `isEmpty()`, `clear()` | $O(1)$ |
