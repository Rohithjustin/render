FROM amazoncorretto:17
LABEL version="1.0"
VOLUME /tmp

COPY target/Devupers-0.0.1-SNAPSHOT.jar Devupers.jar
ENTRYPOINT ["java", "-jar", "/Devupers.jar"]
EXPOSE 8080

