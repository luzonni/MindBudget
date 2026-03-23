
### Extensions

    quarkus-arc
    quarkus-hibernate-orm-panache
    quarkus-hibernate-validator
    quarkus-smallrye-openapi
    quarkus-jdbc-postgresql
    quarkus-rest
    quarkus-rest-jackson
    lombok

### Command:

    ./mvnw quarkus:add-extension -Dextensions="arc"
    ./mvnw quarkus:add-extension -Dextensions="hibernate-orm-panache"
    ./mvnw quarkus:add-extension -Dextensions="hibernate-validator"
    ./mvnw quarkus:add-extension -Dextensions="smallrye-openapi"
    ./mvnw quarkus:add-extension -Dextensions="jdbc-postgresql"
    ./mvnw quarkus:add-extension -Dextensions="rest"
    ./mvnw quarkus:add-extension -Dextensions="rest-jackson"

### POM

    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.44</version>
    </dependency>