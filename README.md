Reproducer for the https://github.com/gradle/gradle/issues/28407


Run this command (with configuration cache disabled):
`./gradlew  --no-configuration-cache --console=verbose :config:clean :config:compileTestKotlin --rerun-tasks`

It will fails with the following error:
```shell
> Task :config:compileJava NO-SOURCE
> Task :config:classes
> Task :config:jar

> Configure project :app
Unable to make progress running work. The following items are queued for execution but none of them can be started:
  - Build ':':
      - Waiting for nodes:
          - other build task :config:clean (state=SHOULD_RUN, dependencies=NOT_COMPLETE, group=task group 0, no dependencies, taskState=Scheduled, exportedTaskState=Scheduled )
          - other build task :config:compileTestKotlin (state=SHOULD_RUN, dependencies=NOT_COMPLETE, group=task group 1, no dependencies, taskState=Scheduled, exportedTaskState=Scheduled )
      - Ordinal groups:
          - group 0 entry nodes: [other build task :config:clean (SHOULD_RUN)]
          - group 1 entry nodes: [other build task :config:compileTestKotlin (SHOULD_RUN)]
  - Build ':config':
      - Waiting for nodes:
          - :config:compileTestKotlin (state=SHOULD_RUN, dependencies=COMPLETE_AND_SUCCESSFUL, group=task group 1, dependencies=[Resolve mutations for :config:compileTestKotlin (EXECUTED), destroyer locations for task group 0 (EXECUTED), :config:checkKotlinGradlePluginConfigurationErrors (EXECUTED), :config:classes (EXECUTED), :config:compileJava (EXECUTED), :config:compileKotlin (EXECUTED), :config:jar (EXECUTED)], has-failed-dependency=false )
          - :config:clean (state=SHOULD_RUN, dependencies=COMPLETE_AND_SUCCESSFUL, group=task group 0, dependencies=[Resolve mutations for :config:clean (EXECUTED)], has-failed-dependency=false )
      - Nodes ready to start:
          - :config:clean
          - :config:compileTestKotlin
      - Scheduling events:
          - node added to plan: destroyer locations for task group 0, when: scheduled, state: SHOULD_RUN, dependencies: 1, is ready node? false
      - Ordinal groups:
          - group 0 entry nodes: [:config:clean (SHOULD_RUN)]
          - group 1 entry nodes: [:config:compileTestKotlin (SHOULD_RUN)]
  - Workers waiting for work: 9
  - Stopped workers: 1

FAILURE: Build failed with an exception.

* What went wrong:
Unable to make progress running work. There are items queued for execution but none of them can be started
```

Run this command (with configuration cache enabled):
```shell
`./gradlew  --configuration-cache --console=verbose :config:clean :config:compileTestKotlin --rerun-tasks`
```

This command will fail with compilation error: `Unresolved reference: TestObject`