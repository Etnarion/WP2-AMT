FROM openjdk:8-jdk-alpine

COPY swagger-spring-1.0.0.jar app.jar
COPY wait-for-it.sh wait-for-it.sh
COPY run.sh run.sh

RUN chmod +x wait-for-it.sh
RUN chmod +x run.sh
RUN apk update && apk add bash

CMD ["./run.sh"]
