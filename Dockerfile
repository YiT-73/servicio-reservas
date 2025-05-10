FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
# Especificar la codificación UTF-8 para Maven y saltar el filtrado de recursos
RUN mvn -Dfile.encoding=UTF-8 -Dmaven.resources.skip=true clean package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
# Copia manualmente el archivo de propiedades
COPY src/main/resources/application.properties /app/application.properties
EXPOSE 8081
ENTRYPOINT ["java", "-Dfile.encoding=UTF-8", "-jar", "app.jar"]