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

	Write-Host - no ret value
	Write-output - ret value

	```
	$n =Read-Host "hello name: " -assecurestring
	hello name: : test

	[ValidateRange(100, 200)]$age= Read-Host "age "

	Write-Host "hello there" -foregroundColor blue -BackgroundColor red

	```


comparison operators
	-eq, ceq, ne, lt, le, ge, gt
	-like, clike, match, contains, notcontains, notmatch

array
@(
india
usa
)

If else/elseif, loop, switch
	-and

If(con) {} else {}
```
if ($age -eq 100) {Write-Output "age awe"} else {Write-Output "age sup awe"}
age awe

```
	$day="sunday"
	$activity = if($day -like "sunday" {"fun"} else {"work"}
	

switch(<test-value>) {
	condition {<action>}
	condition {<action>}
	default {<action>}
}

