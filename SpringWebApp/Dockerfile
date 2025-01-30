# Use an official OpenJDK image as a base image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built application JAR file into the container
COPY target/simpleWebApp-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (change if your app runs on a different port)
EXPOSE 8081

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
