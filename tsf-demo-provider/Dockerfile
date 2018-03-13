FROM openjdk:alpine

ADD ./target/tsf-demo-provider-0.0.1-SNAPSHOT.jar /app/
CMD ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app/tsf-demo-provider-0.0.1-SNAPSHOT.jar ${RUN_ARGS}"]

EXPOSE 8002