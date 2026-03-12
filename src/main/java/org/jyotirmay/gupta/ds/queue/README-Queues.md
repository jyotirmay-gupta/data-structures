# Queue Operations

A standardized interface for **First-In-First-Out (FIFO)** processing, ideal for task scheduling and messaging buffers.

## 🚀 Key Features
- **Dual-Action Methods**: Provides both "exception-throwing" and "special-value" versions for each operation.
- **Predictable Order**: Ensures elements are processed in the exact order they arrive.

## 📋 Method Summary


| Operation Type | Throws Exception | Returns Special Value | Complexity |
| :--- | :--- | :--- | :--- |
| **Insert** | `add(e)` | `offer(e)` | $O(1)$ |
| **Remove** | `remove()` | `poll()` | $O(1)$ |
| **Examine** | `element()` | `peek()` | $O(1)$ |
