import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode

class JvmTest2 {
    @Test
    @Execution(ExecutionMode.CONCURRENT)
    fun testStdout5() {
        val runnable = {
            repeat(REPEAT_COUNT) {
                print(randomText())
                System.err.print(randomText() + "\n")
                fflush()
            }
        }

        val threads = (1..500).map { Thread(runnable) }
        threads.forEach(Thread::start)
        threads.forEach(Thread::join)
    }

    @Test
    @Execution(ExecutionMode.CONCURRENT)
    fun testStdout6() {
        val runnable = {
            repeat(REPEAT_COUNT) {
                print(randomText())
                System.err.print(randomText() + "\n")
                fflush()
            }
        }

        val threads = (1..5).map { Thread(runnable) }
        threads.forEach(Thread::start)
        threads.forEach(Thread::join)
    }

}