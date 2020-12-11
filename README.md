
## COMANDOS DOCKER

### Iniciando Container MYSQL 

```
sudo docker run --name mysql-tcc -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql:5.7

```

### Iniciando Container REDIS

```
sudo docker run --name redis-tcc -p 6379:6379 -d redis:5.0.3 redis-server --appendonly yes
```


### Acessando CLI REDIS no Container

```
docker exec -it redis-tcc sh

# redis-cli

```

### Comandos do CLI

```
KEYS * 

GET "key"

EXISTS key::value

```
