## alloc

- malloc(long) does mark the alloc of mem, but doesn't actually allocate unless used.
- so any no. of proc could be running alloc'ing mem.

 available mem = 28gb
 proc1 = 28gb
 proc2 = 28gb
 .
 .
 .
 etc

 if proc1 requires more than available mem(29gb for example), alloc would fail.

 proc1=26gb
 proc2=2gb
 proc3=2gb
 	proc3 would fail if proc1 and proc2 requires pages available in ram/using all allocated mem.

```
VmData reflects alloc'ed memory whether used or unused.
``` 
 	.net could be allocing no prot pages and not being used.
