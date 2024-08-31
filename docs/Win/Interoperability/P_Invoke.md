## P/Invoke

- native code or Com code
- interoperability calling .net to native and native to .net
- DllImport() attr with dll name
- mark method as static and extern
- dll engine will call Loadlibrary and getProcAddr to invoke the func.

Managed code:
	- running under the control of Clr
	-  Mem magmt - garbage collection
	- Exc handling
Unmanaged code:
	- code that the Clr knows nothing about.
	- Mem magmt - manual
	- err handling - ret values/SEH/c++ exceptions.

 windows
  - P/Invoke is often used to call functions from the Win32 API, which are provided by DLLs like user32.dll, kernel32.dll, etc.
 linux
 there is no equivalent to the Win32 API. Instead, P/Invoke is used to call functions from native libraries available on Linux, typically implemented in C or C++ like libc etc.
