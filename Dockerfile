FROM adoptopenjdk/openjdk11
ADD target/docker-spring-boot-db.jar /docker-spring-boot-db.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "docker-spring-boot-db.jar"]