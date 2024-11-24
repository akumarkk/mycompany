###### Replication

Multi-leader replication
Conflict Avoidance (Recommended approach)
The simplest strategy for dealing with conflicts is to avoid them. So according to this technique if the application can ensure that all writes for a particular record go through the same leader (data center), then conflicts cannot occur.

we are going to have one leader in each of my data centers and each data center’s leader replicates its changes to the leaders in other data centers asynchronously.

High Fault Tolerance as each data center can continue operating independently of others if any data center goes down. This is possible because each data center has its leader. Also, replication catches up when the failed datacenter comes back online (Might be by promoting a follower as a leader and asking for the latest changes from the leaders of other data centers).