FROM java:8-jre
MAINTAINER Karthik Gunasekaran

ADD ./target/orderservice-1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/orderservice-1.0.jar"]

EXPOSE 9091