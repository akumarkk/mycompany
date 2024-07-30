## net

tcpdump:
sudo tcpdump -i en0 host www.google.com and tcp port 443

client
curl --header "Connection: keep-alive" --keepalive-time 160 "https://www.google.com/"

