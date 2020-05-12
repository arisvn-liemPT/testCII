FROM maven:3.6.1-jdk-11-slim AS testCII-build

WORKDIR /testCII

COPY ./ /testCII

RUN mvn verify clean --fail-never
	
RUN echo '### Build pakage with profile ' \
	&& mvn clean install -DskipTests

FROM openjdk:11

WORKDIR /root
		
COPY --from=testCII-build \
		/testCI/target/TestCII-1.0-SNAPSHOT.jar \
		/root/testCII.jar


ENTRYPOINT ["java", "-jar", "testCII.jar"]