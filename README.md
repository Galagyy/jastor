# Jastor
> Jastor is a Java File Server created using Springboot.

## Features
- Read files from server.
- Write files from server.
- Modify files on server.
- View a list of all files on server.

Jastor also offers a variety of other features.

## Quick Start
In order to run Jastor, you must have the [JRE](https://adoptium.net/temurin/releases/?version=17) installed. **Ensure that your JRE version is either Java 17 or higher.** Following the installation of Java, you can run the `.jar` file offered on the releases page by simply double clicking the `.jar` file in your file explorer.

If you wish to run it from the commandline, you can instead install the [JDK](https://adoptium.net/temurin/releases/?version=17) and run the following command. **Please ensure your JDK version is either Java 17 or higher.**

```bash
# If you have the JDK installed, you can run this command instead.
# (!!!) This command will not work if you have the JRE installed.
java -jar Jastor.jar
```

## Building
If you wish to build the program from source, you can use Maven. Maven is the primary build manager for Jastor. You can use Maven using the `mvnw` or `mvnw.cmd` files provided in the project. **Please ensure that you have JDK 17+ installed.**

### MacOS
If you are using MacOS, you must give `mvnw` the proper execute permissions in order to prevent conflicts.
```bash
chmod +x .\mvnw

.\mvnw package

java -jar target\*.jar
```

### Windows
If you are using Windows, you do not need to set execute permissions.
```bash
.\mvnw package

java -jar target\*.jar
```

## Setup
The project is made using [Springboot](https://spring.io/projects/spring-boot) and [Maven](https://maven.apache.org/).
