FROM openjdk:14-alpine
COPY target/micronaut-ms*.jar micronaut-service.jar
EXPOSE 7980
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-service.jar"]