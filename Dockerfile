FROM bellsoft/liberica-openjdk-debian:21
MAINTAINER Hendi Santika "hendisantika@yahoo.co.id"
ENV PORT 8080
COPY target/*.jar /opt/app.jar
WORKDIR /opt
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
