FROM ubuntu-java
RUN apt-get install maven -y
COPY . .
ENTRYPOINT ["mvn", "-version", "sleep 3600"]


