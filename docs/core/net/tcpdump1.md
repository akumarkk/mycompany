## filters
### 1. display filters
### 2. capture filters
	follows bpf syntax
	- host filters
		host 192.168.10.10
		ether host <mac>
		dst host 192.168.10.10
		src host 192.168.10.10

	- network filters
		net 192.168.1.0//24
		src net 192.168.1.0/24
		dst net 192.168.1.0/24

	- port filters
		port 80
		dst port 80
		src port 80
		portrange 1000-2000

	- protocol filters
		tcp
		udp
		icmp
		arp
		ether proto 0x0806

	- ethernet traffic
		ether type 0x0800
		ether host 00:11:22:33:44:55
		ether broadcast
		ether multicast

	- complex filters
		and
		or
		not (not host 192.168.10.10)

	- filters
		less 64	// packet size
		greater 1500 // packet size
		vlan 10
