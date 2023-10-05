# spring-boot-starter-qrcode

![Build Workflow](https://github.com/mohsin-naroo/spring-boot-starter-qrcode/actions/workflows/maven-build.yml/badge.svg)

Spring Boot starter to generate QR Code via REST API

## Requirements

- [Java 17](https://www.oracle.com/pk/java/technologies/downloads/#java17)
- [Maven 3](https://maven.apache.org)

## Running the application locally

- Execute the `main` method of `io.github.meritepk.webapp.Application` class from IDE

or

- Use [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like `mvn spring-boot:run`

Open [http://localhost:8080/api/v1/barcodes/qrcode](http://localhost:8080/api/v1/barcodes/qrcode?text=https://meritepk.github.io/) in web browser
