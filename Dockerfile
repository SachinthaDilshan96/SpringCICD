# Step 1: Use an official Java runtime as a base image
FROM openjdk:17-jdk-slim

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the Spring Boot JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the application port
EXPOSE 8080

# Step 5: Define the command to run the application
CMD ["java", "-jar", "app.jar"]
