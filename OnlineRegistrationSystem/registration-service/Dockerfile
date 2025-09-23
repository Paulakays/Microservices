#Build the project using maven
FROM eclipse-temurin:21-jdk-alpine
#sets the working directory inside the container as /app
WORKDIR /app
#Copies the .jar from local build
COPY target/registration-service-0.0.1-SNAPSHOT.jar registration-service.jar
#Tells the container to listen on port 8083
EXPOSE 8083
#Tells Docker how to run the app
ENTRYPOINT ["java","-jar","registration-service.jar"]