###### Api proxy
- acts as a gateway and single point for all incoming requests
- HA service that enables secure publishing of REST Apis to the unstrusted public n/w and enforces policies to protect them.


Proxy
- auth, author, RL and enc
- routing, LB and caching
- Analytics - logging, monitoring, & perf metrics
- Monetization - api usage and quotas
- deployed as standalone component, often in cloud-native environment.

###### Service mesh
A layer of infrastructure that sits below your application and provides capabilities like traffic management, service discovery, security, and observability.
Istio enables these features for workloads running on virtual machines, and in addition allows these workloads to utilize Istio functionality such as mutual TLS (mTLS), rich telemetry, and advanced traffic management capabilities.

https://istio.io/latest/docs/ops/deployment/vm-architecture/

- Linkerd, istio
Traffic management
 - LB, canary deployments, A/B testing, Fault injection
 - Security - Mutual TLS, Authentication and authorization, Encryption
 - Observability - Distributed tracing, Metrics, Logging

###### Producer & consumer
provider/producer - app hosting the REST Apis and cannot be accessed from untrusted n.w unless firewall rules are made them accessible from internet.

consumer - an app trying to access the prpvider app from the untrusted n.w.


###### Api
- to consume data or capabilities of Apis