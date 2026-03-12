# CircularQueue (Ring Buffer) API

A high-efficiency FIFO structure using a fixed-size buffer that wraps around to reuse memory.

## 🚀 Key Features
- **Memory Reuse**: Connects the end back to the start via modulo arithmetic.
- **Fixed Footprint**: Essential for embedded systems with limited memory.
- **Full Support**: Extends standard Queue interfaces for library compatibility.

## 📋 Extended Method Summary


| Method | Purpose | Complexity |
| :--- | :--- | :--- |
| `isFull()` | Checks if the buffer is at maximum capacity. | $O(1)$ |
| `peekRear()` | Inspects the most recently added item (the tail). | $O(1)$ |
| `capacity()` | Returns the fixed total slots allocated. | $O(1)$ |
