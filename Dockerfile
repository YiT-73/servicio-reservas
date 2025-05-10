FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8081
# Variables de entorno para MongoDB
ENV SPRING_DATA_MONGODB_HOST=172.31.26.21
ENV SPRING_DATA_MONGODB_PORT=27017
ENV SPRING_DATA_MONGODB_DATABASE=reserva
ENTRYPOINT ["java", "-jar", "app.jar"]