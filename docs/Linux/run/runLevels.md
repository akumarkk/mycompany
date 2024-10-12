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

###### system control
- systemctl - command to control system services
- replaces the service command


```
systemctl start|stop|status servicename.service
systemctl enable servicename.service // boottime enable
systemctl restart | reload servicename.service
systemctl list-units -all

//services config file /run/systemd/system

```

###### sysVinit vs init vs systemd
init - predessesor of systemd
    - initialization
    - fs init
    - proc init
    - run levels

ubuntu 14.0 init based
ubuntu 15.0 systemd based

