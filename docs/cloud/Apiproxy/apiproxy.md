###### Api proxy
- acts as a gateway and single point for all incoming requests
- HA service that enables secure publishing of REST Apis to the unstrusted public n/w and enforces policies to protect them.


Proxy
- auth, author, RL and enc
- routing, LB and caching
- Analytics - logging, monitoring, & perf metrics
- Monetization - api usage and quotas
- deployed as standalone component, often in cloud-native environment.

###### Producer & consumer
provider/producer - app hosting the REST Apis and cannot be accessed from untrusted n.w unless firewall rules are made them accessible from internet.

consumer - an app trying to access the prpvider app from the untrusted n.w.


###### Api
- to consume data or capabilities of Apis