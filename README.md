# Dokka "Recursion detected in a lazy value under LockBasedStorageManager" bug


Run `./gradlew dokkaGfm --stacktrace`. It will fail with the exception: `java.lang.AssertionError: Recursion detected in a lazy value under LockBasedStorageManager@66605091 (Dokka)`.
