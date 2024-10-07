###### istio

service mesh used to secure, connect, observe and control network traffic within a cluster.
- policies to route the traffic in case of canary deployments (90%v2, 10%v1)
- mTLS between the micro-services
- observe the system
- control the traffic; ui service shouldn't talk to inventory directly.
 ui can talk to catalogv1 or catalogv2.

 - each micro-service(catalog, inventory, ui-service) pod is ingested with a side-car container of istio proxy. egress and ingress network traffic goes through istio side car proxy.
 - cluster will have ingressgateway and the virtual service which route the traffic across cluster.