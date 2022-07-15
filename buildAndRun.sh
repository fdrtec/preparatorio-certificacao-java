#!/bin/sh
if [ $(docker ps -a -f name=preparatorio-certificacao-java | grep -w preparatorio-certificacao-java | wc -l) -eq 1 ]; then
  docker rm -f preparatorio-certificacao-java
fi
mvn clean package && docker build -t br.com.academia/preparatorio-certificacao-java .
docker run -d -p 9080:9080 -p 9443:9443 --name preparatorio-certificacao-java br.com.academia/preparatorio-certificacao-java
