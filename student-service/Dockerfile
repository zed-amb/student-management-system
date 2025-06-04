FROM ubuntu:latest
LABEL authors="naabe"

ENTRYPOINT ["top", "-b"]

# Use Maven image to build the app
FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use JDK runtime to run the app
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=builder /app/target/student-service-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
