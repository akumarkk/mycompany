## prog
- similar to f#, everything is obj - oops
- get-member - introspection of an obj
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


collections
$a = @(10, 23)
$a = @("hi", "hello")
Write-Host "$($a[0])"

	- array - fixed size
	- arraylist - list
		$l = new-object system.collections.arraylist
		not homogeneous
	- hash table - 
		$kvp = @{ k1="v1"; k2="v2"; }
		$kvp.Add(k1, v1);

Iterations

	while ($i -lt 10) {}
	while($i -gt 0) {write-output $i; $i--;}

	For loop
	for(init; cond; inc) {}

	for($i=0; $i -lt $a.Count; $i++) {write-output $a[$i]}


	Foreach
	foreach($k in $a) {}
	foreach($i in $a) {Write-Output $i}



Function

	function Verb-Noun(ar1, ar2){
		# $args(default) array of args
	}


	function Get-Args($args1, $args_opt) {Write-Host $args1; Write-Host "hello $args_opt";}
	Get-Args $a "wc" 
	Write-Host "$($a[0])"


	function Get-Args() {param ([string]$Name, [int]$age=200) Write-Host $age; Write-Host "hello $Name";}
	Get-Args -Name "arjun" -age 100

try-catch

try{
	Get-Content -path "test.log" -ErrorAction stop
}catch {

} finally {
	# execute irrespective of ex occur or no
}

trow "file not found at loc"

try {Get-Content -path "test.log" -ErrorAction Stop}
catch [System.IO.FileNotFoundException] 
catch{ Write-Output "file not found"} 
finally {Write-Output "res free"}

Cmdlets
Cmdlets are specialized .NET classes written in C# that are designed to perform a specific function in PowerShell. They are the building blocks of PowerShell scripts and provide the core functionality.

	Performance: Cmdlets are typically more efficient and faster than functions because they are compiled .NET classes.
	Standardization: Cmdlets follow a standardized naming convention, usually in the form of Verb-Noun (e.g., Get-Process, Set-Item).

	Designed for seamless pipeline integration.

Use Cmdlets when you need high performance, standard tasks, and advanced parameter handling. They are ideal for repetitive and standardized operations.

Use Functions for custom tasks, quick automation scripts, and when flexibility is required. Functions are easier to write and modify, making them suitable for user-specific logic.

$ErrorActionPreference = 'stop'
Get-Content -path "test.log" -ErrorAction SilentlyContinue -ErrorVariable "error_var"

