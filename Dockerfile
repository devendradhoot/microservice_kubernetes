FROM openjdk:11-jre
# Refer to Maven build -> finalName
ARG JAR_FILE=target/spring-boot-docker.jar

#changed the working directory
WORKDIR /opt/app

# cp target/springboot-kubernetes-0.0.1-SNAPSHOT.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]