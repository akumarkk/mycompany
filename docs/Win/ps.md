## ps

module - package of cmdlets
ise - int. server ennv.

## get help
verb-noun


```
Update-Help -Module CimCmdlets -Force
Get-Help Get-CimInstance -Online

get-Help Get-CimInstance -ShowWindow

get-help "about*" // help on topic 


Import-Module CimCmdlets

Get-Command -Module CimCmdlets

```

comments 
  # or <# #>

cmdlets
	get-location
	set-location ..
	get-date

	get-childitem -recurse/-path <path> #ls; list
	write-output "print text" #echo;
	write-host "print text" #echo;
	clear-host #clear;
	copy-item .\file -destination <path>
	copy-item .\dir\* -destination <path> -recurse #copy cont of subfolder
	move-item -path .\dir\file -destination .\dir1\filerename #mv
	rename-item -path .\dir\file -newname filerename
	remove-item -path .\folder\* #rm

	get-history #history


## programming

variable 
	$var = assign
	$global:var_name = assign #global var scope in ps/session.

	get-variable
	set-variable -name "var_name" -value assign -option constant/readonly 
	new-variable -name "var_name" -value assign
	remove-variable -name "var"

	clear-variable -name "var"
	${var with space} = assign #var