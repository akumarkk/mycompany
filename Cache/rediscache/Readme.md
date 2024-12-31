##### Redis gears for readthrough caching
```
redis-cli rg.pyexecute "`cat wordcount.py`"
redis-cli RG.PYEXECUTE "`cat maxage.py`"

# logs
# cat log.txt
Processing key: {'event': 'hset', 'key': 'person:6', 'type': 'hash', 'value': {'age': '210', 'name': 'Surya'}}
Processing key: {'event': 'hset', 'key': 'person:6', 'type': 'hash', 'value': {'age': '210', 'name': 'Surya'}}
Processing key: 210
Processing key: 210
Processing key: {'event': 'hset', 'key': 'person:7', 'type': 'hash', 'value': {'age': '21', 'name': 'Surya'}}
Processing key: {'event': 'hset', 'key': 'person:7', 'type': 'hash', 'value': {'age': '21', 'name': 'Surya'}}
Processing key: 21
Processing key: 21

```

Docker Images
```
docker pull redislabs/redisgears:latest
docker run -p 6379:6379 redislabs/redisgears:latest
```

Ref : https://github.com/RedisGears/RedisGears/tree/master