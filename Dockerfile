FROM eclipse-temurin:17-jdk-alpine

RUN mkdir application

COPY my-java-application-1.0-SNAPSHOT.jar application/app.jar

WORKDIR /application

RUN addgroup -S test01 && adduser -S chas -G test01

RUN chown chas:test01 /application/app.jar

USER appuser

CMD ["java", "-jar", "app.jar"]