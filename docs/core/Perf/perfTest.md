## Perf testing


- non-functional s/w testing to ensure s/w works under exp. workload.
- the focus of perf test is to ensure
	- 


The focus of perf test is checking s/w program's 
	- Speed
	- reliability
	- scalability


Perf testing :
- load testing
	- under user anti. load
- stress testing
	- under extreme work loads, app break point.
- endurance testing
	- exp. load over long per. of time.
- spike testing
	- s/w reaction to large spike in load
- volume testing
 	- - large vol. of data is generated in db, app perf under varying db volumes.

perf problems:
  - long load times
  - poor response times
  - poor scalability
  - bottlenecking
	- bottlenecks are abstraction in a system which degrade overall perf.
  - perf bottlenecks
  	- cpu utilization
  	- mem utilization
  	- n/w utilization
  	- os initiation
  	- disk usage

Performance bottlenecks are the parts of a system that significantly limit its overall speed or efficiency.
They can occur in hardware, software, or even network infrastructure.
- Hardware Upgrades
- Software Optimization
- Database Tuning
- Network Optimization: Reduce network traffic, improve network configuration, and consider using caching or load balancing.
- Parallel Processing: Explore parallel computing techniques to distribute workloads across multiple cores or machines.

If a web application is experiencing slow page load times, profiling tools might reveal that database queries are taking an excessive amount of time. By optimizing the database queries, adding appropriate indexes, or potentially caching query results, the performance can be significantly improved.


Perf Testing Process
- identify test environment
	- h/w, s/w, n/w configs
- plan and design perf tests
	- all possible use cases
- identify perf acceptance criteria
- configure test environment
- implement test design
- execute tests
- Analyze and report

Metrics
- process usage
- memory usage
- disk time
- bandwidth - bits/sec used by the network.
- private bytes - number of bytes allocated that can't be shared with processes.
- committed bytes - amount of virtual bytes used.
- throughput - req/res throughput - req/res per sec.
- Response time - 
- connection pooling
- Max active sessions
- Hit ratios - # of sql ops that are handled by cached data instead of expensive IO operations.
- Thread counts - an app health can be measured by the no. of threads that are running and currently active.


 ##### response time
 - isn't measured per each req for ex: path of each end point, instead app's are verified/validated against the acceptance criteria:
 	- verify response time is not >4sec when 1000 users access the website simultaneously.
	- verify response time of the app under load is within the acceptable range when the network connectivity is slow.
	- check the mx users that the app can handler before it crashes.
	- check data ba. Execution time when 500 records are read/written simultaneously.
	- check cpu and memory usage of the app and db server under peak load conditions.
	- verify response time of the app under low, moderate, normal and heavy load conditions.  