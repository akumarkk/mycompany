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


Request Authentication
Request Authentication is the mechanism of verifying the identity of the user or service making a request. Istio enables request-level authentication using JWT through its Authentication Policy and Envoy proxy sidecar. The policy defines JWT as the authentication mechanism and provides necessary JWT details. The sidecar intercepts requests, validates JWT tokens based on the policy, and allows or denies requests accordingly, ensuring only authorized access within the service mesh. Istio can authenticate end-user requests by validating a JSON Web Token (JWT) using either a custom authentication provider or any compliant OpenID Connect (OIDC) identity provider like Keycloak. Requests that match the JWT validation rules are allowed to pass through to the destination application services. The Istio proxies automatically reject requests that fail the JWT validation. By default, requests without a JWT are allowed to pass through to the application services. To block requests without a JWT, you need to combine request authentication policies with authorization policies that require authenticated claims.

- istio enforces secure comm using mTLS or JWT
- Mutual TLS (mTLS):Each microservice has a unique certificate. When a request is made, the sender's certificate is presented to the receiver. The receiver verifies the certificate to authenticate the sender.
    - Strong security: Encrypts communication and verifies identities.
    - Zero-trust security model: Every request is authenticated.
- JSON Web Tokens (JWT): A dedicated authentication service issues JWT tokens to microservices. These tokens contain claims about the issuing service, such as its identity and permissions.The authentication service signs the JWT with a private key.
    - Istio intercepts requests between microservices.
    - It validates the JWT token by:
Verifying the signature using the public key of the authentication service.
Checking the issuer claim to ensure the token was issued by the authorized service.