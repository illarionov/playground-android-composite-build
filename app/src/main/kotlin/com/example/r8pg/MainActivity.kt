package com.example.r8pg

import android.app.Activity
import android.os.Bundle
import com.example.pgr8.R
import com.example.r8pg.logger.Logger
import com.example.r8pg.logger.IntLogger
import com.example.r8pg.logger.Severity

val logger = Logger(severity = Severity.WARN, tag = "MainActivity")
val intLogger = IntLogger(severity = IntLogger.SEVERITY_WARN, tag = "MainActivityInt")

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logger.v { "VERBOSE message 1" }
        logger.v { "VERBOSE message 2" }
        logger.v { "VERBOSE message 3" }

        logger.i { "INFO message" }
        logger.i { "INFO message 2" }
        logger.i { "INFO message 3" }

        for (i in 1..3) {
            logger.w { "WARN message $i" }
        }

        for (i in 1..3) {
            logger.e { "ERROR message $i" }
        }


        intLogger.v { "intLogger VERBOSE message 1" }
        intLogger.v { "intLogger VERBOSE message 2" }
        intLogger.v { "intLogger VERBOSE message 3" }

        intLogger.i { "intLogger INFO message" }
        intLogger.i { "intLogger INFO message 2" }
        intLogger.i { "intLogger INFO message 3" }

        for (i in 1..3) {
            intLogger.w { "intLogger WARN message $i" }
        }

        for (i in 1..3) {
            intLogger.e { "intLogger ERROR message $i" }
        }
    }
}