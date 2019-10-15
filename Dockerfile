FROM openjdk:8-jre-slim as openjdk
COPY . /home/app/eureka-cliente-sample
WORKDIR /home/app/eureka-cliente-sample
COPY target/eureka-cliente-sample-*.jar eureka-cliente-sample-RELEASE.jar
RUN chmod 755 eureka-cliente-sample-RELEASE.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dfile.encoding=UTF-8", "eureka-cliente-sample-RELEASE.jar"]