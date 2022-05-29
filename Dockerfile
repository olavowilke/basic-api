FROM openjdk:11
MAINTAINER olavodetona
COPY target/crud-api-0.0.1-SNAPSHOT.jar crud-api-1.0.0.jar
ENTRYPOINT ["java","-jar","/crud-api-1.0.0.jar"]