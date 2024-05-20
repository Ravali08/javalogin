FROM ubuntu:latest

RUN apt-get update && apt-get install -y git && apt-get install -y openjdk-8-jdk  && apt-get install -y maven
RUN git clone https://github.com/Ravali08/javalogin.git
WORKDIR /javalogin
RUN mvn clean package
