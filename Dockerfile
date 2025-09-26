# Stage 1: Build the application using Maven
FROM maven:3.9.9-eclipse-temurin-17 AS builder

# Set working directory inside the container
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Stage 2: Run the application using a lightweight JDK image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy built JAR from the previous stage
COPY --from=builder /app/target/*.jar app.jar

# Expose port (adjust if different)
EXPOSE 8080

# Default command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
