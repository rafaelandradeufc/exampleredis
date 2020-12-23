
## COMANDOS DOCKER

### Criando Container MYSQL 

```
docker run --name mysql-tcc -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql:5.7

```

### Criando Container REDIS

#### Sem senha
```
docker run --name redis-tcc -p 6379:6379 -d redis:5.0.3 redis-server --appendonly yes
```
#### Com senha

```
docker run --name redis-tcc -p 6379:6379 -d redis:5.0.3 redis-server --requirepass sua-senha --appendonly yes
```

### Acessando CLI REDIS no Container

```
docker exec -it redis-tcc sh

# redis-cli

```

### Comandos do REDIS CLI

```
AUTH sua-senha

KEYS * 

SET "key" value

GET "key"

DEL "key"

EXISTS key::value

SELECT index_db

```
