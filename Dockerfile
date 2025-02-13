FROM tomcat:jre17-temurin-jammy

LABEL maintainer=”rsankolli”

ADD target/SampleJavaAppRS.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
