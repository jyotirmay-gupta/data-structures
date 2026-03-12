# Priority Queue (Heap) Operations

A **Priority Queue** is an abstract data type where each element has a "priority" associated with it. Elements with higher priority are served before elements with lower priority.

## 🚀 Key Features
- **Efficient Extraction**: Guaranteed $O(\log n)$ time to extract the minimum or maximum element.
- **Dynamic Ordering**: Automatically re-sorts itself upon every insertion or removal.
- **Heap Implementation**: Typically implemented using a **Binary Heap** (represented as an array) for optimal memory usage.

## 📋 Performance Summary


| Operation | Time Complexity | Description |
| :--- | :--- | :--- |
| **Insert** | $O(\log n)$ | Adds element and "sifts up" to maintain heap property. |
| **Extract Max/Min**| $O(\log n)$ | Removes root and "sifts down" the new root. |
| **Peek** | $O(1)$ | Returns the root element without modification. |
| **Heapify** | $O(n)$ | Converts an unsorted array into a valid heap. |

## 🛠 Usage Example
```java
PriorityQueueOperations<Integer> pq = new BinaryMaxHeap<>();

pq.insert(10);
pq.insert(30);
pq.insert(20);

System.out.println(pq.peekPriority()); // Output: 30 (Highest value)
System.out.println(pq.extractPriority()); // Output: 30
System.out.println(pq.peekPriority()); // Output: 20
