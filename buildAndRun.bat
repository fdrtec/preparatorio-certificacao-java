@echo off
call mvn clean package
call docker build -t br.com.academia/preparatorio-certificacao-java .
call docker rm -f preparatorio-certificacao-java
call docker run -d -p 9080:9080 -p 9443:9443 --name preparatorio-certificacao-java br.com.academia/preparatorio-certificacao-java