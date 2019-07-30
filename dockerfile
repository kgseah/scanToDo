FROM java:8
WORKDIR /
ADD target/scanToDo-1.0-SNAPSHOT.jar scanToDo.jar
EXPOSE 8080
CMD ["java", "-jar", "scanToDo.jar"]