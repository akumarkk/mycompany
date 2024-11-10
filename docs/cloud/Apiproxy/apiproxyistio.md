###### istio

Architecture
An Istio service mesh is logically split into a data plane and a control plane.
The data plane is composed of a set of intelligent proxies (Envoy) deployed as sidecars. These proxies mediate and control all network communication between microservices. They also collect and report telemetry on all mesh traffic.
- control plane - manages and configures the proxies to route the traffic

Envoy
Envoy proxies are the only Istio components that interact with data plane traffic.

Istiod
Istiod provides service discovery, configuration and certificate management.
Istiod converts high level routing rules that control traffic behavior into Envoy-specific configurations, and propagates them to the sidecars at runtime.
You can use Istio’s Traffic Management API to instruct Istiod to refine the Envoy configuration to exercise more granular control over the traffic in your service mesh.
Istiod acts as a Certificate Authority (CA) and generates certificates to allow secure mTLS communication in the data plane.
Istiod security enables strong service-to-service and end-user authentication with built-in identity and credential management