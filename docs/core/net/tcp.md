## tcp

- any intermediate devices/conn could cause the packet loss.
- ARQ - to resend the packet.
- The data is copied from the system memory buffers (where DMA placed it) into the TCP receive buffer.
	nic ring buffer --> system memory buffers(skb (socket buffer)) --> tcp recv buffer(tcp_sock)
- buffers - senders/receiver proc at diff speeds, so buffer.
	sysctl net.inet.tcp.recvspace
	/proc/sys/net/ipv4/tcp_rmem
	/proc/sys/net/ipv4/tcp_wmem // Specifies the minimum, default, and maximum size of the send buffer

	sock.setsockopt(socket.SOL_SOCKET, socket.SO_SNDBUF/SO_RCVBUF, 1024 * 1024) 