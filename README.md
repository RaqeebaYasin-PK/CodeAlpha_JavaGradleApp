CodeAlpha Java Gradle Application

📌 Project Overview

CodeAlpha Java Gradle Application is a Java-based project developed using Gradle as the build automation tool.
The purpose of this project is to demonstrate core DevOps concepts in Java development, including automated builds, structured dependency management, and continuous integration/continuous delivery (CI/CD).

This repository fulfills Internship TASK 3: Java Application using Gradle by implementing industry-standard build and delivery practices.

🎯 Internship Task Objectives Covered

This project successfully addresses the following internship requirements:
Automate Java project builds using Gradle
Manage dependencies efficiently using Gradle configurations
Integrate CI/CD pipelines for continuous delivery
Streamline build and deployment workflows
Apply and demonstrate DevOps principles in Java development


✨ Key Features

1. Gradle Build Automation

Uses Gradle Wrapper for consistent builds across environments
Automated tasks for cleaning, compiling, testing, and packaging
Reproducible and reliable build lifecycle

2. Dependency Management

Dependencies declared in build.gradle
Proper usage of scopes such as:
implementation
testImplementation
Centralized and maintainable dependency configuration

3. CI/CD Integration

CI/CD pipeline configured (e.g., GitHub Actions)

Automatically triggered on:
Code push
Pull requests
Executes build and test stages
Generates build artifacts

4. Streamlined Build & Delivery

Single-command build using Gradle
Automated validation through CI/CD
Reduced manual intervention in build and deployment

5. DevOps Principles Applied

Automation over manual processes
Version-controlled build configuration
Continuous integration and delivery
Consistent environments using Gradle Wrapper


🛠 Prerequisites

Ensure the following are installed before running the project locally:
Java JDK 11 or higher
Git
No separate Gradle installation required (Gradle Wrapper included)


🚀 Getting Started

Clone the repository:

git clone https://github.com/RaqeebaYasin-PK/CodeAlpha_JavaGradleApp.git
cd CodeAlpha_JavaGradleApp


▶️ Usage Instructions
Build the Project
./gradlew clean build


This command will:

Clean previous builds
Compile the source code
Execute tests
Generate a JAR file
Run the Application
After a successful build:
java -jar build/libs/<artifact-name>.jar


Replace <artifact-name>.jar with the actual generated JAR file name.


🔁 CI/CD Pipeline

The project includes a CI/CD workflow (located in .github/workflows/) that:

Automatically triggers on code changes
Builds the project using Gradle
Runs automated tests
Produces build artifacts
Ensures code quality before merge
This pipeline demonstrates real-world DevOps automation practices used in professional environments.


📁 Project Structure
CodeAlpha_JavaGradleApp

├── .github/workflows/        # CI/CD pipeline configuration

├── gradle/                  # Gradle wrapper files

├── src/main/java/            # Application source code

├── src/test/java/            # Test cases

├── build.gradle              # Gradle build configuration

├── settings.gradle           # Project settings

├── build/                    # Generated artifacts

└── README.md                 # Project documentation


📘 Learnings & Outcomes

Through this project, the following concepts were applied and practiced:

Gradle build automation
Dependency lifecycle management
CI/CD pipeline integration
DevOps workflow implementation
Professional Java project structuring


📄 Contribution & License

This repository is part of an internship assignment and is not intended for external contributions.
For verification or evaluation purposes, please contact the project author.


👩‍💻 Author

Raqeeba Yasin
BS Computer Science
Intern – DevOps
