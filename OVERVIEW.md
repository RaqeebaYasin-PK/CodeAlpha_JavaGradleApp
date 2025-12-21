# Student Management System (Console, Java 17, Gradle-ready)

## Overview
- Console-based application implementing basic student CRUD operations.
- Clean separation into `model`, `service`, `util`, `main` packages.
- In-memory storage using `ArrayList` (no database).
- Java 17 compatible; Gradle `application` plugin configured; runnable JAR manifest set.

## Features
- Add a student
- View all students
- Search student by ID
- Update student details
- Delete a student
- Exit

## Architecture
- `model`: student entity and domain representation  
  - `src/main/java/com/example/sms/model/Student.java`
- `service`: business logic and CRUD on the in-memory list  
  - `src/main/java/com/example/sms/service/StudentService.java`
- `util`: input helpers and validation  
  - `src/main/java/com/example/sms/util/InputUtil.java`
- `main`: entry point and menu-driven console UI  
  - `src/main/java/com/example/sms/main/Main.java`

## Tech Stack & Configuration
- Language: Java 17
- Build: Gradle-ready (`build.gradle`, `settings.gradle`)
- Entry point: `com.example.sms.main.Main` (`src/main/java/com/example/sms/main/Main.java:1`)
- JAR manifest `Main-Class` configured in `build.gradle`
- No external dependencies

## Folder Structure
```
.
├── build.gradle
├── settings.gradle
└── src
    └── main
        └── java
            └── com
                └── example
                    └── sms
                        ├── main
                        │   └── Main.java
                        ├── model
                        │   └── Student.java
                        ├── service
                        │   └── StudentService.java
                        └── util
                            └── InputUtil.java
```

