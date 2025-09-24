#Build the project using maven
FROM eclipse-temurin:21-jdk-alpine
#sets the working directory inside the container as /app
WORKDIR /app
#Copies the .jar from local build
COPY target/student-service-0.0.1-SNAPSHOT.jar student-service.jar
#Tells the container to listen on port 8081
EXPOSE 8081
#Tells Docker how to run the app
ENTRYPOINT ["java","-jar","student-service.jar"]