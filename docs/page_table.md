### Page table
- page table per process
- During a context switch, the CPU updates its page table base register to the new process’s pgd_t.

Process Control Block (PCB) or task structure in Linux (struct task_struct)
Memory Descriptor (mm_struct):
The memory management information for a process is encapsulated in a structure called mm_struct.
mm_struct includes a pointer to the pgd_t of the process.

Page Table Walk: Traverses multiple levels (PGD, PUD, PMD, PTE) to translate the virtual address.
