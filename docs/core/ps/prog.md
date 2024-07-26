## prog

link - https://learn.microsoft.com/en-us/dotnet/api/?view=powershellsdk-7.4.0

datatype
	$var.gettype()
	bool
	int, double
	string dquote - resolves $var
		squote - no $var resolved
		escape char (`)
		@""@ - raw string
	datetime


	-is validate type
	-  $var | get-member #MemberType Definition
	- [int]$var = 0

read, validate and write
	```
	$n =Read-Host "hello name: " -assecurestring
	hello name: : test
	```
