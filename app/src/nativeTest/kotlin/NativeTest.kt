import kotlin.test.Test
import kotlinx.cinterop.ExperimentalForeignApi
import platform.posix.fflush
import platform.posix.fputs
import platform.posix.stderr
import platform.posix.stdout
import platform.posix.usleep

const val REPEAT_COUNT = 2000

class NativeTest1 : NativeBaseTest()
class NativeTest2 : NativeBaseTest()

@OptIn(ExperimentalForeignApi::class)
abstract class NativeBaseTest {
    @Test fun testStdout1() = floodStdoutStderr()
    @Test fun testStdout2() = floodStdoutStderr()
    @Test fun testStdout3() = floodStdoutStderr()
    @Test fun testStdout4() = floodStdoutStderr()
    @Test fun testStdout5() = floodStdoutStderr()
    @Test fun testStdout6() = floodStdoutStderr()
    @Test fun testStdout7() = floodStdoutStderr()
    @Test fun testStdout8() = floodStdoutStderr()
    @Test fun testStdout9() = floodStdoutStderr()

    private fun floodStdoutStderr() {
        repeat(REPEAT_COUNT) {
            usleep(1U)
            fputs(randomText(), stdout)
            fputs(randomText(), stderr)
            fflush(stdout)
            fflush(stderr)
        }
    }
}