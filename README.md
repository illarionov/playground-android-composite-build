# Android Screenshot Test bug on JDK24

Test project to showcase [issues/414962883](https://issuetracker.google.com/issues/414962883): 
"Compose Preview Screenshot Testing is not compatible with JDK24"
￼
Steps to reproduce:

Make sure you are using JDK24:
```shell
$ java -version
openjdk version "24.0.1" 2025-04-15
OpenJDK Runtime Environment Corretto-24.0.1.9.1 (build 24.0.1+9-FR)
OpenJDK 64-Bit Server VM Corretto-24.0.1.9.1 (build 24.0.1+9-FR, mixed mode, sharing)
```

Clone the project (branch `bug-jdk24-screenshottest`) and validate screenshots:

```shell
git clone https://github.com/illarionov/playground-android-composite-build.git -b bug-jdk24-screenshottest
cd playground-android-composite-build
./gradlew ./gradlew :app:validateDebugScreenshotTest --rerun-tasks
```

It fails with the following error:
```shell
> Task :app:validateDebugScreenshotTest FAILED
Error occurred during initialization of VM
java.lang.Error: A command line option has attempted to allow or enable the Security Manager. Enabling a Security Manager is not supported.
        at java.lang.System.initPhase3(java.base@24.0.1/System.java:1947)


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:validateDebugScreenshotTest'.
> Process 'Gradle Test Executor 2' finished with non-zero exit value 1
```
