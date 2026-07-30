FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

RUN cp target/*.jar app.jar

EXPOSE 8080

<<<<<<< HEAD
CMD ["java", "-jar", "target/kisansakthi-0.0.1-SNAPSHOT.jar"]
=======
CMD ["java", "-jar", "app.jar"]
>>>>>>> 2aab438793f155a2441fc98018f53fc3ac8e4bd7
