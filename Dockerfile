FROM openjdk:8-jdk-alpine
RUN apk add --no-cache curl tar bash
VOLUME /tmp
ADD build/libs/hello-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","/app.jar"]