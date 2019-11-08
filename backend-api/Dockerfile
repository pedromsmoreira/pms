FROM gradle:jdk11 as builder

COPY ./backend-api/ /src
WORKDIR /src
RUN gradle build

FROM openjdk:11-jre-slim
EXPOSE 8080
COPY --from=builder /src/build/libs/api-*.jar /app/pms-api.jar

WORKDIR /app
CMD ["java", "-jar", "pms-api.jar"]