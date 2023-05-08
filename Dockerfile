FROM amazoncorretto:11-alpine-jdk
MAINTAINER GGC
COPY target/Gerardocornalo-0.0.1-SNAPSHOT.jar ggc-app.jar
ENTRYPOINT ["java","-jar","/ggc-app.jar"]
