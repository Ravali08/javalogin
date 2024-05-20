FROM tomcat:9.0.64-jdk17-openjdk-slim

COPY ./target/*.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
