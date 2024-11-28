###### TPS
QPS (Queries Per Second):

Measures the number of individual queries or requests a system can process in one second.
Focuses on the individual operations performed on the system.
Often used to assess the performance of database systems or API endpoints.
TPS (Transactions Per Second):

Measures the number of complete transactions a system can process in one second.
Considers a transaction as a series of related operations that together constitute a logical unit of work.
Often used to assess the overall performance of a system, including database operations, application logic, and network communication.

Key Differences:

Granularity: QPS is a more granular metric, measuring individual operations, while TPS considers a broader scope of related operations.
Focus: QPS is often used to evaluate the performance of specific components, such as a database server, while TPS is used to assess the overall system performance.
Relationship: In many cases, a single transaction may involve multiple queries. Therefore, TPS is often lower than QPS, as a single transaction can encompass several queries.