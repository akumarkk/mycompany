###### Object storage
One of the design principles of object storage is to abstract some of the lower layers of storage away from the administrators and applications. Thus, data is exposed and managed as objects instead of blocks or (exclusively) files. Objects contain additional descriptive properties which can be used for better indexing or management. Administrators do not have to perform lower-level storage functions like constructing and managing logical volumes to utilize disk capacity or setting RAID levels to deal with disk failure.

Object storage provides programmatic interfaces to allow applications to manipulate data. At the base level, this includes Create, read, update and delete (CRUD) functions for basic read, write and delete operations. Some object storage implementations go further, supporting additional functionality like object/file versioning, object replication, life-cycle management and movement of objects between different tiers and types of storage. Most API implementations are REST-based, allowing the use of many standard HTTP calls.

Some notable examples are 
- Amazon Web Services S3, which debuted in March 2006,
- Microsoft Azure Blob Storage, Rackspace Cloud Files (whose code was donated in 2010 to Openstack project and released as OpenStack Swift), and 
- Google Cloud Storage released in May 2010.
- Ceph and MinIO
