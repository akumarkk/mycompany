### Debug

cat /proc/sys/kernel/core_pattern
sudo sh -c 'echo "/var/coredumps/core-%e-%p-%t" > /proc/sys/kernel/core_pattern'
sudo mkdir -p /var/coredumps
sudo chmod 1777 /var/coredumps
echo "ulimit -c unlimited" >> ~/.bashrc
source ~/.bashrc
