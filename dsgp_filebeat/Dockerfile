FROM alpine:3.7

COPY dsgp_filebeat /filebeat/dsgp_filebeat
COPY dsgp_filebeat.yml /filebeat/dsgp_filebeat.yml
COPY *.json /filebeat/

CMD ["sh", "-c", "cd /filebeat; ./dsgp_filebeat -c ./dsgp_filebeat.yml"]
