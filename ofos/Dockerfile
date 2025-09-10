# Stage 1: build the app
FROM maven:3.9.4-openjdk-17 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package -DskipTests

# Stage 2: run the app
FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]






git and github integration
ur are working with github on menu.jsp of OFOS project using git handle these:
    1.u start coding a new feature but realize the project is not under version control so initialize a git repo and push it to github
    2.u accedentlu wrote "added payement module" instead added payment module" in ur commit msg since u haven't pushed yet how do u fix it 
    3.u need to check which files have been modified but not yet commited which git command will u use?
    4.u want t o quickly see the history of commits in a compact view which command will u use?
    5.u deleted menu.jsp by mistake but haven't commited yest.how do u recover it from git?
    6.u want to clone ur teamate's repo and switch directly to the feature payment branch which steps will u follow