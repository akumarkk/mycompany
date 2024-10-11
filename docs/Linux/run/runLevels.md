###### run levels

```
init <run-level>
who -r

// current reboot session
systemctl isolate multi-user.target
systemctl set-default multi-user.target/<target-run-level>
systemctl list-targets
```
run level 0 shut down the system
1 single user mode;
2 multiuser mode without networking
3 multiuser mode with networking
5 multiuser mode with networking and GUI
6 reboot the system
