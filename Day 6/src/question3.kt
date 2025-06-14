fun applyTwice(x: Int, op: (Int) -> Int): Int {
    return op(op(x))
}

fun main() {
    val result = applyTwice(2) { it * 3 }
    println(result)
}
