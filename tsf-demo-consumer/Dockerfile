FROM openjdk:alpine

RUN apk add --no-cache tzdata
ENV TZ  Asia/Shanghai

ADD ./target/tsf-demo-consumer-0.0.1-SNAPSHOT.jar /app/
RUN mkdir -p /app/servlet/logs
CMD ["sh", "-c", "cd /app; java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app/tsf-demo-consumer-0.0.1-SNAPSHOT.jar ${RUN_ARGS}"]

EXPOSE 8001
