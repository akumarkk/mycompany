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


- segments - data >1500b
- segments are stored in tcp_sock.

key files and directories related to TCP queues and their usage:
	- /proc/net/tcp
	- /proc/net/tcp6
	- /proc/sys/net/ipv4/tcp_*
	- /proc/net/dev


Window Size Zero: In some situations, the window size can be set to zero, indicating that the receiver has no buffer space available to accept more data. This situation is known as a "zero window" and signals the sender to pause sending data until the receiver is ready to accept more.


ack num - next seq num of the segment that the recver is ex.
	- also indicates that it has received ack-1 b's.
seq - id of start b in the segment.
