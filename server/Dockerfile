FROM eclipse-temurin:17-jdk-focal as build

COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .

RUN ./mvnw -B dependency:go-offline

COPY src src

RUN ./mvnw -B package

FROM eclipse-temurin:17-jre-focal

COPY --from=build target/server-1.0-SNAPSHOT.jar .

EXPOSE 5556

ENTRYPOINT ["java", "-jar", "server-1.0-SNAPSHOT.jar"]
