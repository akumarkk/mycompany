## awk

cat data.txt 
id	name	country
1	anil	india
2 	anilkum	india
3	charv	us
4	venki	india


```
awk '{print $1}' data.txt 
id
1
2
3
4


awk '{print $NF}' data.txt

awk '{print NR}' data.txt // no. of lines
awk '{print NR, $0}' data.txt // $0 line

awk '{if($3>40000) print$0 }' data.txt 
id	name	salary	country
2 	anilkum	45000	india
4	venki	60000	india

awk '{if($3 ==40000) {$3=80000; print$0} }' data.txt
```