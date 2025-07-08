import kotlin.test.Test
import kotlinx.cinterop.ExperimentalForeignApi
import platform.posix.fputs
import platform.posix.stderr
import platform.posix.stdout
import platform.posix.usleep

@OptIn(ExperimentalForeignApi::class)
class Kotlin4Test {
    @Test fun testStdout1() = floodStdoutStderr()
    @Test fun testStdout2() = floodStdoutStderr()
    @Test fun testStdout3() = floodStdoutStderr()
    @Test fun testStdout4() = floodStdoutStderr()
    @Test fun testStdout5() = floodStdoutStderr()
    @Test fun testStdout6() = floodStdoutStderr()
    @Test fun testStdout7() = floodStdoutStderr()
    @Test fun testStdout8() = floodStdoutStderr()
    @Test fun testStdout9() = floodStdoutStderr()
    @Test fun testStdout10() = floodStdoutStderr()
    @Test fun testStdout11() = floodStdoutStderr()
    @Test fun testStdout12() = floodStdoutStderr()
    @Test fun testStdout13() = floodStdoutStderr()
    @Test fun testStdout14() = floodStdoutStderr()
    @Test fun testStdout15() = floodStdoutStderr()
    @Test fun testStdout16() = floodStdoutStderr()
    @Test fun testStdout17() = floodStdoutStderr()
    @Test fun testStdout18() = floodStdoutStderr()
    @Test fun testStdout19() = floodStdoutStderr()
    @Test fun testStdout20() = floodStdoutStderr()
    @Test fun testStdout21() = floodStdoutStderr()
    @Test fun testStdout22() = floodStdoutStderr()
    @Test fun testStdout23() = floodStdoutStderr()
    @Test fun testStdout24() = floodStdoutStderr()
    @Test fun testStdout25() = floodStdoutStderr()
    @Test fun testStdout26() = floodStdoutStderr()
    @Test fun testStdout27() = floodStdoutStderr()
    @Test fun testStdout28() = floodStdoutStderr()
    @Test fun testStdout29() = floodStdoutStderr()
    @Test fun testStdout30() = floodStdoutStderr()
    @Test fun testStdout31() = floodStdoutStderr()
    @Test fun testStdout32() = floodStdoutStderr()
    @Test fun testStdout33() = floodStdoutStderr()
    @Test fun testStdout34() = floodStdoutStderr()
    @Test fun testStdout35() = floodStdoutStderr()
    @Test fun testStdout36() = floodStdoutStderr()
    @Test fun testStdout37() = floodStdoutStderr()
    @Test fun testStdout38() = floodStdoutStderr()
    @Test fun testStdout39() = floodStdoutStderr()
    @Test fun testStdout40() = floodStdoutStderr()
    @Test fun testStdout41() = floodStdoutStderr()
    @Test fun testStdout42() = floodStdoutStderr()
    @Test fun testStdout43() = floodStdoutStderr()
    @Test fun testStdout44() = floodStdoutStderr()
    @Test fun testStdout45() = floodStdoutStderr()
    @Test fun testStdout46() = floodStdoutStderr()
    @Test fun testStdout47() = floodStdoutStderr()
    @Test fun testStdout48() = floodStdoutStderr()
    @Test fun testStdout49() = floodStdoutStderr()
    @Test fun testStdout50() = floodStdoutStderr()
    @Test fun testStdout51() = floodStdoutStderr()
    @Test fun testStdout52() = floodStdoutStderr()
    @Test fun testStdout53() = floodStdoutStderr()
    @Test fun testStdout54() = floodStdoutStderr()
    @Test fun testStdout55() = floodStdoutStderr()
    @Test fun testStdout56() = floodStdoutStderr()
    @Test fun testStdout57() = floodStdoutStderr()
    @Test fun testStdout58() = floodStdoutStderr()
    @Test fun testStdout59() = floodStdoutStderr()

    private fun floodStdoutStderr(
        startPause: Int = 1,
        secondPause: Int = 3,
        thirdPause: Int = 5,
    ) {
        usleep(startPause.toUInt())
        repeat(REPEAT_COUNT) {
            fputs(randomText(), stdout);
            usleep(secondPause.toUInt())
            fputs(randomText(), stderr);
            usleep(thirdPause.toUInt())
        }
    }
}