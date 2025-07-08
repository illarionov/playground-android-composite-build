import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode

class JvmTest3 {
    @Test
    @Execution(ExecutionMode.CONCURRENT)
    fun testStdout6() {
        repeat(REPEAT_COUNT) {
            print(randomText())
            System.err.print(randomText() + "\n")
            fflush()
        }
    }
}