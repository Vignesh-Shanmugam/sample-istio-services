FROM openjdk:8-jre-alpine
ENV APP_FILE caller-service-jwt-2.0.0-SNAPSHOT.jar
ENV APP_HOME /usr/app
EXPOSE 8092
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]
