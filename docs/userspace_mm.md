###userspace mm
When a process calls brk() to expand its heap size in Linux, the underlying mechanism involves virtual memory management and may lead to allocation of physical pages when necessary.

The brk() system call allows a program to adjust the end of its data segment (heap). It moves the program break, which marks the end of the allocated heap space.