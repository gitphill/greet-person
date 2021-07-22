# Greet Person

Example project that uses maven-shade-plugin to produce
an uber-jar with jackson-core bundled in the final jar.

Simple application that uses jackson-core to parse
the contents of person.json and print to console.

Requires JDK 8.

## Usage

To build the jar file

```
./mvnw clean package
```

To view the contents of jar:

```
jar tf target/greet-person-1.0-SNAPSHOT.jar
```

To run program:

```
java -jar target/greet-person-1.0-SNAPSHOT.jar
```
