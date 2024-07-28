## kube-dns

CoreDNS or kube-dns
coreDns - resolving service names and external dns service.
	- service discovery and comm within the cluster.
	- <service-name>.<namespace>.svc/pod.cluster.local
		my-service.default.svc.cluster.local
	- : <pod-ip-address>.<namespace>.pod.cluster.local

	dns policies
		- clusterFirst
		- default - node's /etc/resolve.conf
		- none - dns configmap
	Configuration
		- ConfigMap named coredns in the kube-system namespace
	DNS Resolution:

		Within the Cluster: The DNS service handles requests for service names and other internal DNS queries.
		External DNS: For external DNS queries (e.g., for public websites), the cluster DNS service typically forwards queries to external DNS resolvers specified in its configuration.
