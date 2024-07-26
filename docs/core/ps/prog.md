## prog

datatype
	$var.gettype()
	bool
	int, double
	string dquote - resolves $var
		squote - no $var resolved
		escape char (`)
		@""@ - raw string


	-is validate type
	-  $var | get-member #MemberType Definition
	- [int]$var = 0
