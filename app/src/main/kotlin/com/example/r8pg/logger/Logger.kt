package com.example.r8pg.logger

import android.util.Log

class Logger(
    val severity: Severity = Severity.INFO,
    val tag: String = "R8pg"
) {
    inline fun v(message: () -> String) = Severity.VERBOSE.also {
        if (severity <= it) {
            log(it, tag, message())
        }
    }

    inline fun v(throwable: Throwable, message: () -> String) = Severity.VERBOSE.also {
        if (severity <= it) {
            log(it, tag, throwable, message())
        }
    }

    fun v(throwable: Throwable) = Severity.VERBOSE.also {
        if (severity <= it) {
            log(it, tag, throwable)
        }
    }

    inline fun i(message: () -> String) = Severity.INFO.also {
        if (severity <= it) {
            log(it, tag, message())
        }
    }

    inline fun i(throwable: Throwable, message: () -> String) = Severity.INFO.also {
        if (severity <= it) {
            log(it, tag, throwable, message())
        }
    }

    fun i(throwable: Throwable) = Severity.INFO.also {
        if (severity <= it) {
            log(it, tag, throwable)
        }
    }

    inline fun w(message: () -> String) = Severity.WARN.also {
        if (severity <= it) {
            log(it, tag, message())
        }
    }

    inline fun w(throwable: Throwable, message: () -> String) = Severity.WARN.also {
        if (severity <= it) {
            log(it, tag, throwable, message())
        }
    }

    fun w(throwable: Throwable) = Severity.WARN.also {
        if (severity <= it) {
            log(it, tag, throwable)
        }
    }

    inline fun e(message: () -> String) = Severity.ERROR.also {
        if (severity <= it) {
            log(it, tag, message())
        }
    }

    inline fun e(throwable: Throwable, message: () -> String) = Severity.ERROR.also {
        if (severity <= it) {
            log(it, tag, throwable, message())
        }
    }

    fun e(throwable: Throwable) = Severity.ERROR.also {
        if (severity <= it) {
            log(it, tag, throwable)
        }
    }

    fun log(severity: Severity, tag: String, throwable: Throwable, message: String = "") {
        if (this.severity > severity) return
        val messageWithTrace = if (message.isEmpty()) {
            Log.getStackTraceString(throwable)
        } else {
            message + "\n" + Log.getStackTraceString(throwable)
        }
        log(severity, tag, messageWithTrace)
    }

    fun log(severity: Severity, tag: String, message: String) {
        if (this.severity > severity) return
        Log.println(severity.androidLogLevel(), tag, message)
    }

    private fun Severity.androidLogLevel(): Int = when (this) {
        Severity.VERBOSE -> Log.VERBOSE
        Severity.INFO -> Log.INFO
        Severity.WARN -> Log.WARN
        Severity.ERROR -> Log.ERROR
        else -> Log.VERBOSE
    }
}