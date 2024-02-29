FROM openjdk:17-jdk
COPY backend/target/backend-1.0-SNAPSHOT.jar /usr/src/vuespringtemplate.jar
WORKDIR /usr/src/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "vuespringtemplate.jar"]