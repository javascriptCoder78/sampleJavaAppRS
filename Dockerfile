FROM tomcat:jre17-temurin-jammy

LABEL maintainer=”rsankolli”

ADD target/SampleJavaAppRS-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
