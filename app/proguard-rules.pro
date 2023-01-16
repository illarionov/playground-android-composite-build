-dontobfuscate
-optimizationpasses 20

-assumenosideeffects class com.example.r8pg.logger.IntLogger {
    int severity return 1..3;
}

-assumevalues class com.example.r8pg.logger.Logger {
    com.example.r8pg.logger.Severity severity return com.example.r8pg.logger.Severity.ERROR;
}
