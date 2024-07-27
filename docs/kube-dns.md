## kube-dns

coreDns - resolving service names and external dns service.
	- service discovery and comm within the cluster.
	- <service-name>.<namespace>.svc/pod.cluster.local

	dns policies
		- clusterFirst
		- default - node's /etc/resolve.conf
		- none - dns configmap