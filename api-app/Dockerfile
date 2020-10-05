## Multi stage build
FROM maven:3 as build

WORKDIR  /app

COPY . /app

RUN ["mvn","package","-DskipTests"]

FROM openjdk:8-jdk

WORKDIR /app

COPY --from=build /app/target/api-app-1.0.jar /app/api-app.jar

EXPOSE 8080

## DB Connection properties AS enviornment variables
## Below values are DEFAULTS, Must be Overidden in deployment artifacts
ENV DBURL=orderdb DBUSER=mahendra DBPASS=pass@1234 DBNAME=orderdb

CMD [ "java","-jar","/app/api-app.jar" ]