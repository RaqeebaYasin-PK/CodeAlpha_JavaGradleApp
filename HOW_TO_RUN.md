# How to Run

## Prerequisites
- Java 17 installed and available on your `PATH`.
  - Verify: `java -version` and `javac -version`
- Gradle is optional. If not installed, use the Java-only steps.

## Option A: Java Only (no Gradle)
1. Open a terminal in the project root:
   ```
   cd c:\Users\DELL\OneDrive\Attachments\Desktop\CodeAlpha_JavaGradleApp
   ```
2. Compile:
   ```
   javac -d out src/main/java/com/example/sms/model/Student.java ^
              src/main/java/com/example/sms/service/StudentService.java ^
              src/main/java/com/example/sms/util/InputUtil.java ^
              src/main/java/com/example/sms/main/Main.java
   ```
3. Run:
   ```
   java -cp out com.example.sms.main.Main
   ```

## Option B: Gradle (if installed)
1. Build:
   ```
   gradle clean build
   ```
2. Run:
   ```
   gradle run
   ```
3. Run the built JAR:
   ```
   java -jar build/libs/student-management-console-1.0.0.jar
   ```

## Gradle Wrapper (optional, recommended)
- If `gradlew` is not present and you have Gradle installed once:
  ```
  gradle wrapper
  ```
- Then use:
  ```
  .\gradlew clean build
  .\gradlew run
  ```

## Usage Notes
- Enter numeric options `1`–`6` at the menu.
- Input validation will prompt again for invalid numbers or emails.

