FROM ubuntu-java
RUN apt-get install maven -y
ENV mysqldb mysqldb-test
COPY . .



