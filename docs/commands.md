### commands

## Memory management
vmstat // per sec report
iostat // per sec report
swapon // swap space report
free -h // ram and swap report


## Disk management
lsblk -l
sudo blkid 
sudo fdisk -l

```
sudo blkid 
/dev/sda1: UUID="f214acf4-cfb3-4769-9e1e-82bd781457ab" TYPE="ext4" 
/dev/sda5: UUID="c26382d2-5d6d-4313-86af-972de628766b" TYPE="swap"

lsblk -l
NAME MAJ:MIN RM   SIZE RO TYPE MOUNTPOINT
sda    8:0    0    20G  0 disk 
sda1   8:1    0    16G  0 part /
sda2   8:2    0     1K  0 part 
sda5   8:5    0     4G  0 part [SWAP]
sr0   11:0    1  1024M  0 rom  

df
Filesystem     1K-blocks     Used Available Use% Mounted on
udev             2000608       12   2000596   1% /dev
tmpfs             402824     1312    401512   1% /run
/dev/sda1       16381864 14541716    984956  94% /
none                   4        0         4   0% /sys/fs/cgroup
none                5120        0      5120   0% /run/lock
none             2014100      152   2013948   1% /run/shm
none              102400       44    102356   1% /run/user


sudo fdisk -l

Disk /dev/sda: 21.5 GB, 21474836480 bytes
255 heads, 63 sectors/track, 2610 cylinders, total 41943040 sectors
Units = sectors of 1 * 512 = 512 bytes
Sector size (logical/physical): 512 bytes / 512 bytes
I/O size (minimum/optimal): 512 bytes / 512 bytes
Disk identifier: 0x0005aebf

   Device Boot      Start         End      Blocks   Id  System
/dev/sda1   *        2048    33554431    16776192   83  Linux
/dev/sda2        33556478    41940991     4192257    5  Extended
/dev/sda5        33556480    41940991     4192256   82  Linux swap / Solaris
```
