## dig


## cname
dig www.microsoft.com
; <<>> DiG 9.10.6 <<>> www.microsoft.com
;; global options: +cmd
;; Got answer:
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 55596
;; flags: qr rd ra; QUERY: 1, ANSWER: 4, AUTHORITY: 0, ADDITIONAL: 1

;; OPT PSEUDOSECTION:
; EDNS: version: 0, flags:; udp: 512
;; QUESTION SECTION:
;www.microsoft.com.		IN	A

;; ANSWER SECTION:
www.microsoft.com.	698	IN	CNAME	www.microsoft.com-c-3.edgekey.net.
www.microsoft.com-c-3.edgekey.net. 641 IN CNAME	www.microsoft.com-c-3.edgekey.net.globalredir.akadns.net.
www.microsoft.com-c-3.edgekey.net.globalredir.akadns.net. 641 IN CNAME e13678.dscb.akamaiedge.net.
e13678.dscb.akamaiedge.net. 16	IN	A	104.99.50.44

;; Query time: 31 msec
;; SERVER: 2001:558:feed::1#53(2001:558:feed::1)
;; WHEN: Sat Jul 27 13:42:10 PDT 2024
;; MSG SIZE  rcvd: 213

% ping www.microsoft.com-c-3.edgekey.net
PING e13678.dscb.akamaiedge.net (104.99.50.44): 56 data bytes
64 bytes from 104.99.50.44: icmp_seq=0 ttl=55 time=20.292 ms
^C
--- e13678.dscb.akamaiedge.net ping statistics ---
1 packets transmitted, 1 packets received, 0.0% packet loss
 % 
 % 
 % 
 % ping www.microsoft.com-c-3.edgekey.net.globalredir.akadns.net
PING e13678.dscb.akamaiedge.net (104.99.50.44): 56 data bytes
64 bytes from 104.99.50.44: icmp_seq=0 ttl=55 time=14.925 ms
64 bytes from 104.99.50.44: icmp_seq=1 ttl=55 time=23.445 ms
^C
--- e13678.dscb.akamaiedge.net ping statistics ---
2 packets transmitted, 2 packets received, 0.0% packet loss
round-trip min/avg/max/stddev = 14.925/19.185/23.445/4.260 ms
