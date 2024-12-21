FROM amazoncorretto:17
LABEL version="1.0"
VOLUME /tmp
WORKDIR /app
COPY target/Devupers-0.0.1-SNAPSHOT.jar /app/Devupers.jar
ENTRYPOINT ["java", "-jar", "/app/Devupers.jar"]
EXPOSE 8080

