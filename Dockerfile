FROM ubuntu-java
RUN apt-get install maven -y
COPY . .



