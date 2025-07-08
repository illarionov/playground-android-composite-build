# Kotlin Multiplatform Native test bug

Test project to showcase [gradle/issues/33990](https://github.com/gradle/gradle/issues/33990)

Related issues:
* https://youtrack.jetbrains.com/issue/KT-69896
* https://youtrack.jetbrains.com/issue/KT-69703

### Steps to reproduce

Run `./gradlew app:check --rerun-tasks --stacktrace` (it may take several attempts, try to repeat 5-10 times).

It will fails with the `IndexOutOfBoundsException` or similar exception.


