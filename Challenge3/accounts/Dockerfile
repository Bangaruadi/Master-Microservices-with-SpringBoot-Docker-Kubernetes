#Start with a base image containing Java means installing java
FROM openjdk:21-ea-21-jdk-slim

#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="aditya"

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]