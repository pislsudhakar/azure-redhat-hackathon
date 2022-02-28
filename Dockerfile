#
# Build image
#
FROM gcr.io/cloud-builders/mvn AS build

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package -Djavax.net.ssl.trustStorePassword=changeit
#RUN mvn clean package -f /usr/src/app/pom.xml

#
# Image
#
FROM registry.access.redhat.com/ubi8/openjdk-11:latest
COPY --from=build /usr/src/app/target/*.jar /app.jar

ENV JAVA_OPTS=""
ENV SERVER_PORT 8080

EXPOSE ${SERVER_PORT}

HEALTHCHECK --interval=10s --timeout=3s \
CMD curl -v --fail http://localhost:${SERVER_PORT} || exit 1

ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
