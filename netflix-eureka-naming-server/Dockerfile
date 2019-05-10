FROM openjdk:8u212-jdk-slim
COPY target/netflix-eureka-naming-server-0.0.1-SNAPSHOT.jar .
CMD /usr/bin/java -Xmx400m -Xms400m -jar netflix-eureka-naming-server-0.0.1-SNAPSHOT.jar
EXPOSE 8761