## traceroute

tracert <destination>
traceroute -I <destination> -p <port> -q <hop> -4/6 -g <gateway>

sysctl -a | grep icmp
/etc/sysctl.conf
	net.ipv4.icmp_ratelimit = 1000
	net.ipv4.icmp_ratemask = 88089

config icmp
	echo 1 > /proc/sys/net/ipv4/icmp_echo_ignore_all
	net.ipv4.icmp_echo_ignore_all = 1 #/etc/sysctl.conf
	sudo sysctl -p #app changes

	sudo iptables -A INPUT -p icmp --icmp-type 8 -j ACCEPT
	sudo iptables -A INPUT -p icmp --icmp-type 8 -j DROP
	sudo sh -c 'iptables-save > /etc/iptables/rules.v4' #persist across reboots	 


While traceroute typically uses UDP or ICMP on Unix-like systems, it can also be explicitly configured to use ICMP.

Initial Packet:

traceroute sends packets with a low TTL (Time To Live) value, starting with TTL=1.
Each router along the path decrements the TTL by 1.
When the TTL reaches 0, the router discards the packet and sends back an ICMP "Time Exceeded" message to the sender.
Incrementing TTL:

traceroute sends multiple packets, each time incrementing the TTL by 1.
This continues until the destination is reached or the maximum TTL is exceeded.
Recording Results:

For each TTL value, traceroute records the round-trip time (RTT) and the IP address of the router that sent back the ICMP "Time Exceeded" message.
This process maps out the route and latency of each hop along the path to the destination.