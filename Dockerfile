#Base image
FROM  tomcat:9-jdk8
#Copy my war file into tomcat image war file location
ADD target/DockerComposeEx1 /usr/local/tomcat/webapps/DockerComposeEx1
#Expose tomcat server on port 8080 of this container
EXPOSE 8080
#start tomcat
CMD ["catalina.sh", "run"]


