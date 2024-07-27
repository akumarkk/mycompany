## traceroute

tracert <destination>
traceroute -I <destination>

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