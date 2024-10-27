# Utiliser une image OpenJDK 17 comme base
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Copier le fichier JAR généré par Maven dans le conteneur
COPY target/tp-foyer-5.0.0.jar app.jar

# Exposer le port sur lequel l'application Spring Boot sera exécutée
EXPOSE 8082

# Démarrer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
