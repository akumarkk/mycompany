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

awk '/DMA/{flag=1; next} flag && /managed/{print $2; flag=0}' /proc/zoneinfo 
3840
754857

awk '/Node 0, zone[[:space:]]+Device/{flag=1; next} flag && /managed/{print; flag=0}' /proc/zoneinfo

awk '{if($3 ==40000) {$3=80000; print$0} }' data.txt
```

wildcard chars:
? - matches a char
[] = range of chars


```

ls ????
snap:
firefox  firmware-updater  snapd-desktop-integration

test:
test24.exe  test.c


ls [st]???
snap:
firefox  firmware-updater  snapd-desktop-integration

test:
test24.exe  test.c

```
