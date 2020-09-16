FROM openjdk:11.0.3-jre-slim-stretch
MAINTAINER spring-rest
EXPOSE 8080
ADD target/loja-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]


#COPY target/*.jar app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]