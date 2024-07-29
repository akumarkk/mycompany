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
