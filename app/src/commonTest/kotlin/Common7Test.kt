import kotlin.test.Test

class Common7Test {
    @Test
    fun testStdout7() {
        repeat(REPEAT_COUNT) {
            print(randomText());
        }
    }
}