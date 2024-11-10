###### Api proxy
- acts as a gateway and single point for all incoming requests
- HA service that enables secure publishing of REST Apis to the unstrusted public n/w and enforces policies to protect them.
- Apigee, Kong, Mulesoft Anypoint Platform, Amazon API Gateway, Azure API Management

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


###### Traffic
east-west traffic - the communication between services within a cluster or data center. - this means the interactions between different microservices.

Api proxy - Primarily handles external traffic (north-south traffic)
- Exposing internal services to external clients.
- Securing API endpoints.
- Rate limiting and throttling API traffic.
- When you require advanced API management features like transformation, caching, and rate limiting.



SM - Manages internal traffic between microservices (east-west traffic)
- Traffic Management: Advanced routing, load balancing, and fault injection.
- Security: Enforces mutual TLS, authorization policies, and zero-trust security
- Observability: Provides detailed metrics, logs, and traces for troubleshooting and performance optimization.
- Resiliency: Implements circuit breakers, retries, and timeouts to improve service reliability.

- Controlling traffic flow within a microservices architecture.
- Monitoring and troubleshooting microservices.