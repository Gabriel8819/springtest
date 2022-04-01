FROM ubuntu-java
RUN apt-get install maven -y
COPY . .
ENTRYPOINT ["mvn", "clean verify", "sleep 3600"]


