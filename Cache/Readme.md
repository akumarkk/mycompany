###### Caching Stratergy
1. Write Aside - application updates cache on cache miss!
2. Read through - cache server updates cache on cache miss! cache and db must have the same  schema!
3. Write through -  
    - writes to db and synchronously updates cache
    - cache and db in sync
    - requires 2-phase commit
    - used in conjuction with read through or cache aside
4. Write Back(behind)
    - updates cache and raises an event to update db  asynchronously
    - reduced write latency
    - no data in cache is write to db is delayed
5. Write around - update db and invalidates cache, dirty cache is updated from db!
