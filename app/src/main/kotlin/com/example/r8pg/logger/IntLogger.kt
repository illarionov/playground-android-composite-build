package com.example.r8pg.logger

import android.util.Log


class IntLogger(
    val severity: Int = SEVERITY_INFO,
    val tag: String = "R8pg"
) {
    companion object {
        const val SEVERITY_VERBOSE: Int = 0
        const val SEVERITY_INFO: Int = 1
        const val SEVERITY_WARN: Int = 2
        const val SEVERITY_ERROR: Int = 3
    }

    inline fun v(message: () -> String) = SEVERITY_VERBOSE.also {
        if (severity <= it) {
            log(it, tag, message())
        }
    }

    inline fun v(throwable: Throwable, message: () -> String) = SEVERITY_VERBOSE.also {
        if (severity <= it) {
            log(it, tag, throwable, message())
        }
    }

    fun v(throwable: Throwable) = SEVERITY_VERBOSE.also {
        if (severity <= it) {
            log(it, tag, throwable)
        }
    }

    inline fun i(message: () -> String) = SEVERITY_INFO.also {
        if (severity <= it) {
            log(it, tag, message())
        }
    }

    inline fun i(throwable: Throwable, message: () -> String) = SEVERITY_INFO.also {
        if (severity <= it) {
            log(it, tag, throwable, message())
        }
    }

    fun i(throwable: Throwable) = SEVERITY_INFO.also {
        if (severity <= it) {
            log(it, tag, throwable)
        }
    }

    inline fun w(message: () -> String) = SEVERITY_WARN.also {
        if (severity <= it) {
            log(it, tag, message())
        }
    }

    inline fun w(throwable: Throwable, message: () -> String) = SEVERITY_WARN.also {
        if (severity <= it) {
            log(it, tag, throwable, message())
        }
    }

    fun w(throwable: Throwable) = SEVERITY_WARN.also {
        if (severity <= it) {
            log(it, tag, throwable)
        }
    }

    inline fun e(message: () -> String) = SEVERITY_ERROR.also {
        if (severity <= it) {
            log(it, tag, message())
        }
    }

    inline fun e(throwable: Throwable, message: () -> String) = SEVERITY_ERROR.also {
        if (severity <= it) {
            log(it, tag, throwable, message())
        }
    }

    fun e(throwable: Throwable) = SEVERITY_ERROR.also {
        if (severity <= it) {
            log(it, tag, throwable)
        }
    }

    fun log(severity: Int, tag: String, throwable: Throwable, message: String = "") {
        if (this.severity > severity) return
        val messageWithTrace = if (message.isEmpty()) {
            Log.getStackTraceString(throwable)
        } else {
            message + "\n" + Log.getStackTraceString(throwable)
        }
        log(severity, tag, messageWithTrace)
    }

    fun log(severity: Int, tag: String, message: String) {
        if (this.severity > severity) return
        Log.println(severity.androidLogLevel(), tag, message)
    }

    private fun Int.androidLogLevel(): Int = when (this) {
        SEVERITY_VERBOSE -> Log.VERBOSE
        SEVERITY_INFO -> Log.INFO
        SEVERITY_WARN -> Log.WARN
        SEVERITY_ERROR -> Log.ERROR
        else -> Log.ERROR
    }
}