FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/auth-server-0.0.1-SNAPSHOT.jar app.jar
ENV EUREKA_URL null
ENV CONFIG_SERVER_HOST null
ENTRYPOINT ["java","-jar","/app.jar"]