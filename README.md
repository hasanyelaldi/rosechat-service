# rosechat-service
Rose Chat rest services

## Docker
Docker up
```
docker-compose -f /src/main/resources/docker-compose.yml up -d
```

Cluster config
```
docker exec -ti rabbitmq2 bash

rabbitmqctl stop_app
rabbitmqctl join_cluster rabbit@rabbitmq
rabbitmqctl start_app
```
