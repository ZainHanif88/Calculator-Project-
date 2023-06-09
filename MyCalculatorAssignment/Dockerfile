# Stage 1
FROM maven:3-amazoncorretto-17 as BUILD

WORKDIR /opt/myapp
COPY pom.xml .
COPY ./src ./src
RUN mvn package

# Stage 2
FROM amazoncorretto:17-alpine
WORKDIR /opt/myapp
COPY --from=BUILD opt/myapp/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
