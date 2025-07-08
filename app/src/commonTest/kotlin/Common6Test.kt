import kotlin.test.Test

class Common6Test {
    @Test
    fun testStdout7() {
        repeat(REPEAT_COUNT) {
            print(randomText());
        }
    }
}