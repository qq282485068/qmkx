#FROM java

MAINTAINER "Haijun Liu"<isaiah@sohu.com>

#ADD @project.build.finalName@.jar @project.build.finalName@.jar
#CMD java -jar @project.build.finalName@.jar

ADD ./target/qmkx-service-sys.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/qmkx-service-sys.jar"]

EXPOSE 8082