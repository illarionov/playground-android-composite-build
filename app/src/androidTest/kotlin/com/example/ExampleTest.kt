package com.example

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class ExampleTest(private val param: Int) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "test name with '/' character")
        fun data(): Collection<Array<Any>> = listOf(arrayOf(1))
    }

    @Test
    fun test() {
        assertEquals(1, param)
    }
}