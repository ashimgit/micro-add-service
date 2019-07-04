FROM openjdk:8
RUN bash -c 'mkdir /opt/ashim-docker'
VOLUME /opt/ashim-docker
ADD target/micro-add-service-0.0.1-SNAPSHOT.jar addService.jar
RUN bash -c 'touch /addService.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/addService.jar"]