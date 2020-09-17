# loja-spring-boot



## Requirements

Para construir e executar o aplicativo, você precisa:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Rodando a aplicação localmente

Existem várias maneiras de executar um aplicativo Spring Boot em sua máquina local. Uma maneira é executar o método `main` na classe` com.digivox.desafio.DesafioApplication` de seu IDE.

Como alternativa, você pode usar o [plugin Spring Boot Maven] (https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) assim:

```shell
mvn spring-boot:run
```
## Banco de Dados

Execute o comando para subir um container postgres
```shell
docker-compose up db
```

