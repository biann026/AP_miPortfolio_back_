FROM amazoncorretto:11-alpine-jdk
MAINTAINER PBP
COPY target/pbp-0.0.1-SNAPSHOT.jar pbp-app-jar
ENTRYPOINT ["java","-jar","/pbp-app-jar"]
