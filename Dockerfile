# Step 1: Use Maven image to build the project
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Build jar file
RUN mvn clean package -DskipTests


# Step 2: Run the jar using lightweight Java image
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copy jar from build stage
COPY --from=build /app/target/*.jar app.jar

# Render uses dynamic PORT variable
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
