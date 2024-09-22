# DAI - Java and IntelliJ - idea and maven startup
This repo was made following the instructions from the the [DAI Course part 4](https://github.com/heig-vd-dai-course/heig-vd-dai-course/blob/main/04-java-intellij-idea-and-maven/COURSE_MATERIAL.md) to familiarize myself with the IDE IntelliJ,
 the programming language Java and the ***standard directory structure*** Maven.
## What we did
We started with a simple "*Hello World!*" and build on that to create a commands based terminal application to simply say "*Hi!*" and "*Goodbye!*".
## How to build it
Once cloned, open a terminal and navigate to the newly cloned repo and enter the following command:
```terminal
./mvnw dependency:go-offline clean compile package
```
## How to run
To run the freshly built program, use the following command:
```terminal
# Usage: java-intellij-idea-and-maven-1.0-SNAPSHOT.jar [-hV] <name> [COMMAND]
java -jar target/java-intellij-idea-and-maven-1.0-SNAPSHOT.jar
```