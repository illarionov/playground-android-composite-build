import kotlin.random.Random

fun randomText(): String = CharArray(Random.nextInt(500)) {
    ('A'..'Z').random()
}.concatToString() + "\n"
