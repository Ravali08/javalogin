FROM maven:3.8.4-openjdk-17 AS build


WORKDIR /app
COPY . .
RUN mvn clean package

# Stage 2: Deploy the WAR file to Tomcat
FROM tomcat:9.0.64-jdk17-openjdk-slim

COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
