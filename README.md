Project Name: CodeAlpha Java Gradle Application

Internship Task: TASK 3 – Java Application using Gradle


Objective:


Automate Java project builds using Gradle

Manage dependencies efficiently

Integrate CI/CD pipelines

Streamline build and deployment processes

Apply core DevOps principles in Java development


Key Features:


Gradle Build Automation

Uses Gradle Wrapper for consistent builds

Tasks for cleaning, compiling, testing, packaging

Reproducible builds across environments

Dependency Management

Dependencies declared in build.gradle

Proper scopes (implementation, testImplementation)

Centralized, maintainable dependency configuration

CI/CD Integration

GitHub Actions workflow triggers on push or pull requests

Automates build, test, and artifact generation

Demonstrates real-world DevOps automation

Streamlined Build & Delivery

Single-command build: ./gradlew clean build

Automated validation through CI/CD

Reduces manual intervention

DevOps Principles

Version-controlled builds

Continuous integration & delivery

Consistent environments via Gradle Wrapper



Prerequisites


Java JDK 11 or higher
Git installed
Gradle Wrapper included (no separate Gradle install needed)


Getting Started


git clone https://github.com/RaqeebaYasin-PK/CodeAlpha_JavaGradleApp.git


cd CodeAlpha_JavaGradleApp

./gradlew clean build

java -jar build/libs/<your-jar-file>.jar



CI/CD Pipeline


Workflow in .github/workflows/

Builds project automatically on code changes

Runs tests and produces artifacts

Ensures code quality before merge


Notes


All source code is in src/

Compiled classes in out/

Reports and build outputs in build/
