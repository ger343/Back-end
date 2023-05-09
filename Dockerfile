FROM amazoncorretto:11-alpine-jdk
MAINTAINER GGC
COPY /target/gerardocornalo-0.0.1-SNAPSHOT.jar ggc-app.jar
ENTRYPOINT ["java","-jar","ggc-app.jar"]
