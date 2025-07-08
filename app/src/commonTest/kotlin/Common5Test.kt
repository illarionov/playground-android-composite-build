import kotlin.test.Test

class Common5Test {
    @Test
    fun testStdout5() {
        repeat(REPEAT_COUNT) {
            print(randomText());
        }
    }
}
