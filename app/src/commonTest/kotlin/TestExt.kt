import kotlin.random.Random

const val REPEAT_COUNT = 500

fun randomText(): String = CharArray(Random.nextInt(80)) {
    ('A'..'Z').random()
}.concatToString() + "\n"
